def  partition( ar) 
	n = ar.count;
	pivot = ar.shift
	left = Array.new()
	right = Array.new()

	ar.each do |value|
		if value <= pivot
			left.push(value)
		else
			right.push(value)
		end
	end
	for i in 0..left.count
		ar[i] = left[i]
	end
	ar[left.count] = pivot
	for i in 0..right.count
		ar[i+1+left.count] = right[i]
	end
	ar.each { |a| print a, " " }
end

cnt = gets.to_i;
ar = STDIN.gets.chomp.split(" ");
partition(ar);
