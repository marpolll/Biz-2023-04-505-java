package com.marpol.memo.models;

public class MemoDto {
	
		public int mseq; //	NUMBER
		public String mwriter; //	nVARCHAR2(20)
		public String mdate; //	VARCHAR2(10)
		public String msubject; //	nVARCHAR2(20)
		public String mcontent; //	nVARCHAR2(400)
		
		
		
		public MemoDto() {
			super();
			// TODO Auto-generated constructor stub
		}



		public MemoDto(int mseq, String mwriter, String mdate, String msubject, String mcontent) {
			super();
			this.mseq = mseq;
			this.mwriter = mwriter;
			this.mdate = mdate;
			this.msubject = msubject;
			this.mcontent = mcontent;
		}



		@Override
		public String toString() {
			return "MemoDto [mseq=" + mseq + ", mwriter=" + mwriter + ", mdate=" + mdate + ", msubject=" + msubject
					+ ", mcontent=" + mcontent + "]";
		}
		


}
