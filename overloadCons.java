class Box
{
	double width,height,depth;
	Box(double w ,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	Box(){
		width=height=depth=-1;
	}
	Box(double len){
		width=height=depth=len;
	}
	double volume(){
		return (width*height*depth);
	}
}
class overloadCons
{
	public static void main(String[] args){
		
		Box mybox1=new Box(10,20,30);
		Box mybox2=new Box();
		Box mybox3=new Box(10);
		double vol1=mybox1.volume();
		double vol2=mybox2.volume();
		double vol3=mybox3.volume();
		System.out.println(vol1);
		System.out.println(vol2);
		System.out.println(vol3);
	}
}
