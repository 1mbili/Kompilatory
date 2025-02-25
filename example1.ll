declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
@strf = constant [4 x i8] c"%f\0A\00"
@strd = constant [4 x i8] c"%lf\00"
@strl = constant [6 x i8] c"%lld\0A\00"
%moja_struct= type{i32, double}
@b = global i32 0
@c = global double 0.0
define i32 @main() nounwind{
%a_def = alloca %moja_struct
%1 = getelementptr %moja_struct, %moja_struct* %a_def, i32 0, i32 0
store i32 4, i32* %1
%2 = getelementptr %moja_struct, %moja_struct* %a_def, i32 0, i32 1
store double 1.0, double* %2
%3 = getelementptr %moja_struct, %moja_struct* %a_def, i32 0, i32 0
%4 = getelementptr %moja_struct, %moja_struct* %a_def, i32 0, i32 0
%5 = load i32, i32* %4
store i32 %5, i32* @b
%6 = getelementptr %moja_struct, %moja_struct* %a_def, i32 0, i32 1
%7 = getelementptr %moja_struct, %moja_struct* %a_def, i32 0, i32 1
%8 = load double, double* %7
store double %8, double* @c
%9 = load i32, i32* @b
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %9)
%11 = load double, double* @c
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strf, i32 0, i32 0), double %11)
ret i32 0 }
