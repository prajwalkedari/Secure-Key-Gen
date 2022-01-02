import datetime
now =datetime.datetime.now()
min_=now.minute*2
mon=now.month*6
yrs = now.year*7
hour=now.hour*4
date=now.day*9
#min_,mon,yrs,hour,date
Key=f"{min_}{mon}{yrs}{hour}{date}"
print("Key:-",Key)
