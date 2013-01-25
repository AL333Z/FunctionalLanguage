
	lfp
	push -1
	push 3
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 5
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	jal sommatutti
	print

	push 3
	push 5
	sub
	push 2
	add
	push 3
	add
	print

	push 10
	push 0
	sw

	push 1
	push 1
	sw

	push 0
	lw
	print

	push 1
	lw
	print


	lfp
	push 0
	jal double
	push 2
	sw

	lfp
	push 1
	jal double
	push 3
	sw

	push 2
	lw
	print

	push 3
	lw
	print


	lfp
	push 0
	jal isZero
	push 4
	sw

	push 4
	lw
	print

	lfp
	push 1
	jal isZero
	push 5
	sw

	push 5
	lw
	print


	lfp
	push 0
	push 5
	jal testFn
	print

	lfp
	push 1
	push 5
	jal testFn
	print

	push -1
	push 3
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 5
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 6
	sw

	push -1
	push 0
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 1
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 7
	sw

	push -1
	push 3
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 5
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 1
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 8
	sw

	push -1
	push 0
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 1
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 0
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 9
	sw

	push -1
	push 0
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 10
	sw

	halt
sommatutti:
	lsp
	sfp
	lra
	push -1
	lfp
	push 0
	add
	lw
	beq label0
	push 0
	b label1
label0:
	push 1
label1:
	push 1
	beq label2
	lfp
	push 0
	add
	lw
	lw
	lfp
	lfp
	push 0
	add
	lw
	push 1	add
	lw
	jal sommatutti
	add
	b label3
label2:
	push 0
label3:
	srv
	sra
	pop
	sfp
	lrv
	jra
double:
	lsp
	sfp
	lra
	push 0
	lfp
	push 0
	add
	lw
	beq label4
	push 0
	b label5
label4:
	push 1
label5:
	push 1
	beq label6
	lfp
	push 0
	add
	lw
	lfp
	push 0
	add
	lw
	add
	b label7
label6:
	push 0
label7:
	srv
	sra
	pop
	sfp
	lrv
	jra
isZero:
	lsp
	sfp
	lra
	push 0
	lfp
	push 0
	add
	lw
	beq label8
	push 0
	b label9
label8:
	push 1
label9:
	push 1
	beq label10
	push 0
	b label11
label10:
	push 1
label11:
	srv
	sra
	pop
	sfp
	lrv
	jra
testFn:
	lsp
	sfp
	lra
	push 1
	lfp
	push 1
	add
	lw
	beq label12
	push 0
	b label13
label12:
	push 1
label13:
	push 1
	beq label14
	push 0
	b label15
label14:
	lfp
	push 0
	add
	lw
label15:
	srv
	sra
	pop
	pop
	sfp
	lrv
	jra
