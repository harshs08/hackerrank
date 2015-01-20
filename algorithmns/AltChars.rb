class AltChars
	def initialize(strs)
		@strs = strs
		@delcount = 0
	end

	def deletion
		if @strs.to_s.length == 1
			return 0
		end

		for j in 0..(@strs.to_s.length-1)
			if(@strs[j]== @strs[j+1])
				@delcount += 1
			end
		end
		return @delcount
	end
end

t = gets.to_i
strsArr = Array.new(t)

(0...t).each do |i|
	strsArr[i] = gets.chomp.to_s
end

for j in 0..(t-1)
	temp = AltChars.new(strsArr[j])
	res = temp.deletion
	puts res.to_i
end