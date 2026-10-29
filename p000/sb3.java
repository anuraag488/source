package p000;

import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sb3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ tb3 f30059A;

    /* JADX INFO: renamed from: t */
    public gx2 f30060t;

    /* JADX INFO: renamed from: u */
    public tb3 f30061u;

    /* JADX INFO: renamed from: v */
    public long f30062v;

    /* JADX INFO: renamed from: w */
    public byte f30063w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f30064x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CharSequence f30065y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f30066z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb3(long j, wm0 wm0Var, tb3 tb3Var, CharSequence charSequence) {
        super(2, wm0Var);
        this.f30065y = charSequence;
        this.f30066z = j;
        this.f30059A = tb3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        sb3 sb3Var = new sb3(this.f30066z, wm0Var, this.f30059A, this.f30065y);
        sb3Var.f30064x = obj;
        return sb3Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((sb3) create((wm0) obj2, (TextClassifier) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        long j;
        aj4 aj4Var;
        gx2 gx2Var;
        tb3 tb3Var;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f30063w;
        if (b == 0) {
            k43.m7376J(obj);
            TextClassifier textClassifier = (TextClassifier) this.f30064x;
            long j2 = this.f30066z;
            int iM9903g = ql4.m9903g(j2);
            int iM9902f = ql4.m9902f(j2);
            CharSequence charSequence = this.f30065y;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iM9903g, iM9902f);
            tb3 tb3Var2 = this.f30059A;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(tb3Var2.m11025c());
            defaultLocales.setIncludeTextClassification(true);
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM10657b = sc6.m10657b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
            tb3 tb3Var3 = this.f30059A;
            if (textClassification != null) {
                aj4 aj4VarM11024b = tb3Var3.m11024b(charSequence, jM10657b, textSelectionSuggestSelection.getTextClassification());
                gx2 gx2Var2 = tb3Var2.f31057e;
                this.f30064x = aj4VarM11024b;
                this.f30060t = gx2Var2;
                this.f30061u = tb3Var2;
                this.f30062v = jM10657b;
                this.f30063w = (byte) 1;
                if (gx2Var2.m6191e(this) != ap0Var) {
                    aj4Var = aj4VarM11024b;
                    gx2Var = gx2Var2;
                    tb3Var = tb3Var2;
                    j = jM10657b;
                    tb3Var.f31059g.setValue(aj4Var);
                }
            } else {
                this.f30062v = jM10657b;
                this.f30063w = (byte) 2;
                if (tb3Var3.m11023a(this.f30065y, jM10657b, textClassifier, this) != ap0Var) {
                    j = jM10657b;
                }
            }
            return ap0Var;
        }
        if (b == 1) {
            j = this.f30062v;
            tb3Var = this.f30061u;
            gx2Var = this.f30060t;
            aj4Var = (aj4) this.f30064x;
            k43.m7376J(obj);
            try {
                tb3Var.f31059g.setValue(aj4Var);
            } finally {
                gx2Var.m6193g(null);
            }
        } else {
            if (b != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f30062v;
            k43.m7376J(obj);
        }
        return ql4.m9897a(j);
    }
}
