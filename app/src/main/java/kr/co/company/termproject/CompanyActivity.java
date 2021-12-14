package kr.co.company.termproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URI;

public class CompanyActivity extends AppCompatActivity {
    ListView list;
    Integer[] images={
            R.drawable.company1, R.drawable.company2, R.drawable.company3, R.drawable.company4, R.drawable.company5,
            R.drawable.company6, R.drawable.company7, R.drawable.company8, R.drawable.company9, R.drawable.company10,
            R.drawable.company11, R.drawable.company12, R.drawable.company13, R.drawable.company14, R.drawable.company15,
            R.drawable.company16, R.drawable.company17, R.drawable.company18, R.drawable.company19, R.drawable.company20,
            R.drawable.company21, R.drawable.company22, R.drawable.company23, R.drawable.company24, R.drawable.company25,
            R.drawable.company26, R.drawable.company27, R.drawable.company28, R.drawable.company29, R.drawable.company30,
            R.drawable.company31, R.drawable.company32, R.drawable.company33, R.drawable.company34, R.drawable.company35,
            R.drawable.company36, R.drawable.company37, R.drawable.company38, R.drawable.company39, R.drawable.company40,
            R.drawable.company41, R.drawable.company42, R.drawable.company43, R.drawable.company44, R.drawable.company45,
            R.drawable.company46, R.drawable.company47, R.drawable.company48, R.drawable.company49, R.drawable.company50,
            R.drawable.company51, R.drawable.company52, R.drawable.company53, R.drawable.company54, R.drawable.company55,
            R.drawable.company56, R.drawable.company57, R.drawable.company58, R.drawable.company59, R.drawable.company60,
            R.drawable.company61, R.drawable.company62, R.drawable.company63, R.drawable.company64, R.drawable.company65,
            R.drawable.company66, R.drawable.company67, R.drawable.company68, R.drawable.company69, R.drawable.company70,
            R.drawable.company71, R.drawable.company72, R.drawable.company73, R.drawable.company74, R.drawable.company75,
            R.drawable.company76, R.drawable.company77, R.drawable.company78, R.drawable.company79, R.drawable.company80,
            R.drawable.company81, R.drawable.company82, R.drawable.company83, R.drawable.company84, R.drawable.company85,
            R.drawable.company86, R.drawable.company87, R.drawable.company88, R.drawable.company89, R.drawable.company90,
            R.drawable.company91, R.drawable.company92, R.drawable.company93, R.drawable.company94, R.drawable.company95,
            R.drawable.company96, R.drawable.company97, R.drawable.company98, R.drawable.company99, R.drawable.company100
    };

    String[] names={
            "한국수자원공사", "한온시스템(주)", "(주)케이티앤지", "한국철도공사", "제일사료(주)",
            "(주)마인즈랩", "(주)제이오텍", "계룡건설산업(주)", "(주)쎄트렉아이", "(주)한국인삼공사",
            "(주)인텍플러스", "한국조폐공사", "국방과학연구소", "(주)바이오니아", "(주)케이티씨에스",
            "(주)플라즈맵", "(주)트위니", "덕산넵코어스(주)", "(주)우성", "(주)네오팜",
            "웅진에너지(주)", "(주)아이디스", "한올바이오파마(주)", "아이쓰리시스템(주)", "(주)엘엑스세미콘",
            "에이치엔에스하이텍(주)", "신용협동조합중앙회", "(주)시드물", "(주)레인보우로보틱스", "(주)이노바이오써지",
            "오가노이드사이언스(주)", "(주)수젠텍", "(주)디엔에프", "(주)금성백조주택", "원텍(주)",
            "이루다플래닛(주)", "(의)영훈의료재단 유성선병원", "(주)솔탑", "(주)삼진정밀", "(주)제노포커스",
            "(주)진합", "한국생명공학연구원", "로쏘(주)", "(주)리베스트", "한국과학기술원",
            "(주)스페이스솔루션", "태아산업(주)", "(주)휴비스", "(주)리얼커머스", "충남대학교병원",
            "한국화학연구원", "(재)한국항공우주연구원", "(주)일리아스바이오로직스", "페리지에어로스페이스(주)", "프리시젼바이오(주)",
            "(주)아이비젼웍스", "(주)플랜아이", "(의)영훈의료재단", "(주)아름덴티스트리", "수퍼빈(주)",
            "(주)바이오오케스트라", "한국축산데이터(주)", "(주)셀바스헬스케어", "한전원자력연료(주)", "(주)레고켐바이오사이언스",
            "(재)한국원자력연구원", "(재)한국연구재단", "(주)알테오젠", "(주)라이온켐텍", "(주)신테카바이오",
            "(주)포텍", "(주)디앤티", "(주)인섹트바이오텍", "(주)알에프세미", "피엔피에너지텍(주)",
            "승일미디어그룹(주)", "(주)시스웍", "(주)씨티이앤씨", "(주)에르코스농업회사법인", "세림티에스지(주)",
            "(주)위드텍", "(주)트루윈", "씨엔씨티에너지(주)", "(주)이삭", "(주)라이트론",
            "(주)이지텍", "(주)한성시스코", "(주)씨앤테크", "(주)와이바이오로직스", "엘아이지정밀기술(주)",
            "에스케이바이오텍(주)", "(주)한컴인스페이스", "(주)두성코프레이션", "(주)사이버메드", "메이킹협동조합",
            "코레일테크(주)", "(주)컨텍", "(주)올댓뷰티아카데미대전", "(주)에스아이에이", "(주)씨앤포스"
    };

    String[] industries = {
            "생활용수 공급업", "공기 조화장치 제조업", "담배 제조업", "철도 여객 운송업", "배합 사료 제조업",
            "응용 소프트웨어 개발 및 공급업", "물질 검사, 측정 및 분석기구 제조업", "종합 건설업", "유인 항공기, 항공우주선 및 보조장치 제조업", "인삼식품 제조업",
            "그 외 기타 특수목적용 기계 제조업", "재정 및 경제정책 행정", "기타 공학 연구개발업", "생물학적 제제 제조업", "데이터베이스 및 온라인정보 제공업",
            "그 외 기타 의료용 기기 제조업", "응용 소프트웨어 개발 및 공급업", "유인 항공기, 항공우주선 및 보조장치 제조업", "배합 사료 제조업", "화장품 제조업",
            "발광 다이오드 제조업", "방송장비 제조업", "완제 의약품 제조업", "전자감지장치 제조업", "비메모리용 및 기타 전자집적회로 제조업",
            "전자감지장치 제조업", "신용조합", "화장품 제조업", "산업용 로봇 제조업", "정형외과용 및 신체보정용 기기 제조업",
            "물리, 화학 및 생물학 연구개발업", "의료용품 및 기타 의약 관련제품 제조업", "그 외 기타 분류 안된 화학제품 제조업", "주거용 건물 건설업", "그 외 기타 의료용 기기 제조업",
            "광고 영화 및 비디오물 제작업", "의료(병원종류별)", "시스템 소프트웨어 개발 및 공급업", "탭, 밸브 및 유사장치 제조업", "생물학적 제제 제조업",
            "볼트 및 너트류 제조업", "물리, 화학 및 생물학 연구개발업", "빵류 제조업", "축전지 제조업", "대학교",
            "탭, 밸브 및 유사장치 제조업", "담배 제조업", "산업처리공정 제어장비 제조업", "전자상거래 소매업", "종합 병원",
            "물리, 화학 및 생물학 연구개발업", "기타 공학 연구개발업", "의학 및 약학 연구개발업", "유인 항공기, 항공우주선 및 보조장치 제조업", "그 외 기타 의료용 기기 제조업",
            "산업처리공정 제어장비 제조업", "컴퓨터 프로그래밍 서비스업", "종합 병원", "치과용 기기 제조업", "산업용 로봇 제조업",
            "기타 인문 및 사회과학 연구개발업", "응용 소프트웨어 개발 및 공급업", "그 외 기타 의료용 기기 제조업", "기타 기초 무기 화학물질 제조업", "의학 및 약학 연구개발업",
            "기타 공학 연구개발업", "기타 인문 및 사회과학 연구개발업", "의학 및 약학 연구개발업", "그 외 기타 분류 안된 화학제품 제조업", "응용 소프트웨어 개발 및 공급업",
            "그 외 기타 의료용 기기 제조업", "비디오 및 기타 영상기기 제조업", "자연과학 및 공학 융합 연구개발업", "발광 다이오드 제조업", "그 외 기타 특수목적용 기계 제조업",
            "광고물 문안, 도안, 설계 등 작성업", "기기용 자동측정 및 제어장치 제조업", "사무ㆍ상업용 및 공공기관용 건물 건설업", "수프 및 균질화식품 제조업", "컴퓨터시스템 통합 자문 및 구축 서비스업",
            "물질 검사, 측정 및 분석기구 제조업", "전자감지장치 제조업", "연료용 가스 제조 및 배관공급업", "기타 가공식품 도매업", "기타 무선 통신장비 제조업",
            "전자상거래 소매업", "기기용 자동측정 및 제어장치 제조업", "경영 컨설팅업", "의학 및 약학 연구개발업", "유선 통신장비 제조업",
            "의약용 화합물 및 항생물질 제조업", "응용 소프트웨어 개발 및 공급업", "임시 및 일용 인력 공급업", "응용 소프트웨어 개발 및 공급업", "교육관련 자문 및 평가업",
            "철도궤도 전문공사업", "응용 소프트웨어 개발 및 공급업", "기타 기술 및 직업훈련학원", "응용 소프트웨어 개발 및 공급업", "자동차 엔진용 신품 부품 제조업",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company);
        CustomList adapter = new CustomList(CompanyActivity.this);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        setTitle("기업보기");
    }

    public class CustomList extends ArrayAdapter<String> {
        private final Activity context;

        public CustomList(Activity context ) {
            super(context, R.layout.company_item, names);
            this.context = context;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView= inflater.inflate(R.layout.company_item, null, true);

            ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            TextView name = (TextView) rowView.findViewById(R.id.name);
            TextView industry = (TextView) rowView.findViewById(R.id.Industry);

            imageView.setImageResource(images[position]);
            name.setText(names[position]);
            industry.setText("ㆍ "+industries[position]);

            return rowView;
        }
    }
}
