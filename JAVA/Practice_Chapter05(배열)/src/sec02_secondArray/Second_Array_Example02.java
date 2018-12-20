package sec02_secondArray;

public class Second_Array_Example02 {

	public static void main(String[] args) {
		//2차원 배열 선언과 동시에 초기화를 하고있다.
		int[][] score = new int[][] {
			{100,100,100},
			{20,20,20},
			{30,30,30},
			{40,40,40}
			};
			
			int korTotal = 0;
			int engTotal = 0;
			int mathTotal = 0;
			
			
			int totalsum =0;
			float averagesum = 0.0f;
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균 ");
			System.out.println("=======================================");
			
			for(int i=0; i<score.length;i++) {
				int sum = 0;
				float avg = 0.0f;
				
				korTotal += score[i][0];
				engTotal+= score[i][1];
				mathTotal+= score[i][2];
				
				System.out.printf("%3d",i+1);
				
				for(int j=0; j<score[i].length;j++) {
					sum+=score[i][j];
					System.out.printf("\t%d",score[i][j]);
				}
				
				totalsum +=sum;
				avg = sum/(float)score[i].length;
				averagesum +=avg;
				System.out.printf("\t%d \t%.2f%n",sum, avg);
			}
			averagesum /=(float)score.length;
			System.out.println("=======================================");
			System.out.printf("총점 \t%d \t%d \t%d \t%d \t%d",korTotal,engTotal,mathTotal,totalsum,averagesum);
	}

}
