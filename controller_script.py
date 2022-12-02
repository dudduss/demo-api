
controllers = []
input_lines = []

with open('controller_service_data.txt', 'r') as f:
  for line in f:
    input_lines.append(line)

for line in input_lines:
  parts = line.split(' ')

  if len(parts) > 0:
    if parts[0].endswith('Controller'):
      # add the controller to the list
      controllers.append({
        'name': parts[0],
        'time': float(parts[-1].replace(',', ''))
      })

# calculate the total time
total_time = sum([c['time'] for c in controllers])
controllers.sort(key=lambda c: c['time'], reverse=True)

# print the percentage of cumulative time for each controller
for controller in controllers:
  percentage = controller['time'] / total_time * 100
  print(f"{controller['name']} {percentage:.2f}%")