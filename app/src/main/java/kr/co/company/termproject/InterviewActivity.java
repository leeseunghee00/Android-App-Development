package kr.co.company.termproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InterviewActivity extends AppCompatActivity {
    ListView list;

    String[] titles = {
            "※ 면접관을 사로잡는 면접의 기본 5가지","첫째, 면접 시 단정한 복장은 기본이다",
            "둘째, 밝은 표정과 바른 자세를 생활화하자","셋째, 질문을 끝까지 주의 깊게 듣고 정확히 답변하자",
            "넷째, 두괄식으로 간략하게 답변하자","다섯째, 이력서 · 자기소개서와\n다른 답변을 하지 않도록 주의하자"
    };

    String[] contents = {
            " 면접 준비 시 면접관에게 호감을 주는 태도와 답변 요령, 기본적인 준비사항에 대해 이해하는 것이 중요합니다. 다음 내용을 숙지하여 실전 면접에서 긴장과 사소한 실수는 줄이고, 자신의 역량과 적합성을 최대한 보여줄 수 있도록 생각과 경험을 진솔하게 표현해보시기 바랍니다.\n",
            " 면접 시 긍정적인 첫인상을 줄 수 있는 단정한 복장과 헤어스타일은 기본입니다. 지원하는 직무에 적합한 이미지를 보여줄 수 있도록 준비해보시기 바랍니다.\n",
            " 복장만큼이나 중요한 것은 밝은 표정과 곧은 자세, 자연스러운 몸짓입니다. 표정과 자세, 시선 처리 등은 단시간에 바꾸기 어려운 부분이므로 평소 바른 자세를 유지하며, 밝은 표정으로 주변 사람들에게 인사하고 말하도록 노력해야 합니다. 또한, 사전에 모의 면접을 통해 연습하고 본인의 모습을 영상으로 촬영한 후 다리를 떨거나 손을 계속해서 움직이지 않는지 등을 파악하여 미리 고치는 것이 필요합니다.\n",
            " 면접에서의 가장 치명적인 실수 중 하나가 바로 동문서답입니다. 자칫 긴장된 상황 속에서 질문의 핵심에서 빗겨난 동문서답을 하지 않도록 면접관의 질문을 끝까지 주의 깊게 들어야 합니다. 질문 중간에 답변을 생각하거나 집중하지 못하는 모습은 면접관이 금방 알아차릴 수 있으며, 정확한 답변도 하지 못할 가능성이 커집니다. 모의 면접 연습을 통해 의식적으로 질문을 끝까지 경청한 후 답변하는 연습을 꼭 해보시기 바랍니다.\n",
            " 질문에 대해 두괄식으로 답변하는 연습은 꼭 필요합니다. 말하고자 하는 핵심 내용을 먼저 말하고 부연설명을 나중에 덧붙여 말해야 면접관이 답변의 요점을 빨리 알아차릴 수 있고 분명하게 의사 전달을 할 수 있습니다. 가장 주의해야 할 것은 요점 없이 너무 장황하게 말하는 것입니다. 말하고자 하는 핵심을 간단하고 논리적으로 말할 수 있도록 준비해야 합니다. 또한, 말끝을 흐리거나 “~것 같습니다.”와 같은 확신 없는 말투를 사용하는 것은 전문성이 부족해 보이므로 주의하시기 바랍니다.\n",
            " 면접은 기본적으로 이력서와 자기소개서에 작성한 내용을 바탕으로 질문하는 경우가 많습니다. 만약 자기소개서의 내용과 면접 시 답변 내용이 다르다면 면접관은 지원자를 신뢰할 수 없을 것이고 진실을 파악하기 위한 추가 질문이 계속되어 압박면접으로 이어질 수 있습니다. 따라서 면접 준비 시 이력서와 자기소개서를 다시 한 번 충분히 숙지하고 이것을 바탕으로 면접관이 물어볼 만한 예상 질문과 답변을 준비해보시기 바랍니다.\n"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interview);
        InterviewActivity.CustomList adapter = new InterviewActivity.CustomList(InterviewActivity.this);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        setTitle("면접 전략");
    }

    public class CustomList extends ArrayAdapter<String> {
        private final Activity context;

        public CustomList(Activity context ) {
            super(context, R.layout.interview_item, titles);
            this.context = context;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView= inflater.inflate(R.layout.interview_item, null, true);

            TextView title = (TextView) rowView.findViewById(R.id.title);
            TextView content = (TextView) rowView.findViewById(R.id.content);

            title.setText(titles[position]);
            content.setText(contents[position]);

            return rowView;
        }
    }
}
