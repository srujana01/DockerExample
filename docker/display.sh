echo "Enter file path: "
read filepath
exec < $filepath

count=1

while read line
do
echo $count.$line
count = 'expr $count+1'
done