min=$(($(date +%M)*2))											
mon="$(($(date +%m)*6))"
year="$(($(date +%Y)*7))"
hour="$(($(date +%H)*4))"
Date="$(($(date +%d)*9))"
echo "key:-" $min$mon$year$hour$Date
