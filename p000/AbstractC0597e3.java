package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.ey0;

/* JADX INFO: renamed from: e3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0597e3 {

    /* JADX INFO: renamed from: a */
    public Object f17656a;

    /* JADX INFO: renamed from: b */
    public final Object f17657b;

    public AbstractC0597e3(hz2 hz2Var) {
        this.f17656a = new C1308wv(this, (byte) 0);
        this.f17657b = new C1270vv(this, hz2Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract int[] mo4905a(int i);

    public Object a$1(yp1 yp1Var, ym0 ym0Var) {
        return ((Boolean) ((ey0) this.f17656a).m13553a("gads:call_all_methods_on_ui_thread:enabled", Boolean.FALSE, C0033as.a$19)).booleanValue() ? lb5.m7921b0((ro0) this.f17657b, new C0821k3(yp1Var, (wm0) null, (byte) 7), ym0Var) : yp1Var.invoke(ym0Var);
    }

    /* JADX INFO: renamed from: b */
    public int[] m4906b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f17657b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public String m4907d() {
        String str = (String) this.f17656a;
        if (str != null) {
            return str;
        }
        z62.m13366Y("text");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4908f() {
        return ((C1308wv) this.f17656a).isEnabled() && ((C1270vv) this.f17657b).f17531e;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo4910j();

    /* JADX INFO: renamed from: m */
    public abstract int[] mo4913m(int i);

    public AbstractC0597e3(ey0 ey0Var, ro0 ro0Var) {
        this.f17656a = ey0Var;
        this.f17657b = ro0Var;
    }

    public AbstractC0597e3() {
        this.f17657b = new int[2];
    }

    /* JADX INFO: renamed from: k */
    public void mo4911k(C1233uv c1233uv) {
    }

    /* JADX INFO: renamed from: i */
    public void mo4909i() {
    }

    /* JADX INFO: renamed from: l */
    public void mo4912l() {
    }
}
