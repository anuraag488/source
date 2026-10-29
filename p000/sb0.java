package p000;

import android.graphics.Color;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30046a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f30047b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f30048c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f30049d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ sw2 f30050e;

    public /* synthetic */ sb0(byte b) {
        this.f30046a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        Object objM10807c;
        byte b = this.f30046a;
        ju4 ju4Var = ju4.f22634a;
        pb0 pb0Var = null;
        switch (b) {
            case 0:
                int i = this.f30047b;
                sw2 sw2Var = this.f30049d;
                yp1 yp1Var = this.f30048c;
                sw2 sw2Var2 = this.f30050e;
                xk4 xk4Var = (xk4) obj;
                C0875lk c0875lk = xk4Var.f34341a;
                String str = c0875lk.f24092b;
                String str2 = c0875lk.f24092b;
                String strM6349o0 = hd4.m6349o0(hd4.m6360z0(str).toString(), "#");
                StringBuilder sb = new StringBuilder();
                int length = strM6349o0.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = strM6349o0.charAt(i2);
                    y62.m12992v(16);
                    int iDigit = Character.digit((int) cCharAt, 16);
                    Integer numValueOf = Integer.valueOf(iDigit);
                    if (iDigit < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                if (string.length() > i) {
                    string = (str2.length() - ((xk4) sw2Var.getValue()).f34341a.f24092b.length() <= 1 || string.length() != 8) ? hd4.m6358x0(i, string) : hd4.m6337c0(2, string);
                }
                if (!string.equals(str2)) {
                    int length2 = string.length();
                    xk4Var = new xk4(4, sc6.m10657b(length2, length2), string);
                }
                sw2Var.setValue(xk4Var);
                if (string.length() == i) {
                    try {
                        objM10807c = pb0.m9462a(zy5.m13869d(Color.parseColor("#".concat(string))));
                    } catch (Throwable th) {
                        sc6.m10643O(th);
                        objM10807c = sj3.m10807c(th);
                    }
                    qq2.m10007B(objM10807c);
                    pb0Var = (pb0) (objM10807c instanceof yc1 ? null : objM10807c);
                }
                if (pb0Var != null) {
                    long j = pb0Var.f27503a;
                    sw2Var2.setValue(pb0.m9462a(j));
                    if (yp1Var != null) {
                        yp1Var.invoke(pb0.m9462a(j));
                    }
                }
                break;
            default:
                int i3 = this.f30047b;
                yp1 yp1Var2 = this.f30048c;
                sw2 sw2Var3 = this.f30049d;
                sw2 sw2Var4 = this.f30050e;
                yb0 yb0Var = new yb0();
                yb0Var.f35081a = i3;
                yb0Var.f35082b = yp1Var2;
                yb0Var.f35083c = sw2Var3;
                yb0Var.f35084d = sw2Var4;
                VarHandle.storeStoreFence();
                ((kz3) obj).m7753a(null, new pg0(-1138895449, true, yb0Var));
                break;
        }
        return ju4Var;
    }
}
