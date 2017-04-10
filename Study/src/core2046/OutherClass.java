package core2046;

public class OutherClass {
	private String name;
	
	public class MemberClass{
		
		public void memberClasssMethod(){
			System.out.println("in member class");
		}
		
	}
	public MemberClass createMemberClass(){
		return new MemberClass();
	}
	public Object createLocalClass(){
		class LocalClass{
			{
				localClassMethod();
			}
			public void localClassMethod(){
				int in = 0;
				System.out.println("in local class");
			}
		}
		LocalClass localClass = new LocalClass();
		return new LocalClass();
	}
	
	public Judge createAnnonymousClass(){
		return new Judge(){
			{
				annonClassMethod();
			}
			private String name;
			private String age;
			public void annonClassMethod(){
				System.out.println("in annon class");
			}
		};
	}
	
	
	
	
//	public LocalClass createLocalClass1(){
//		return new MemberClass();
//}
}
