import subprocess
pl = subprocess.Popen(['ps', '-u', '197609'], stdout=subprocess.PIPE).communicate()[0]
print(pl.decode('utf-8'))