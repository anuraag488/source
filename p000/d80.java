package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class d80 implements yq1 {

    /* JADX INFO: renamed from: a */
    public final ro0 f16848a;

    /* JADX INFO: renamed from: b */
    public final int f16849b;

    /* JADX INFO: renamed from: c */
    public final y30 f16850c;

    public d80(ro0 ro0Var, int i, y30 y30Var) {
        this.f16848a = ro0Var;
        this.f16849b = i;
        this.f16850c = y30Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // p000.yq1
    /* JADX INFO: renamed from: a */
    public final si1 mo193a(ro0 ro0Var, int i, y30 y30Var) {
        ro0 ro0Var2 = this.f16848a;
        ro0 ro0VarPlus = ro0Var.plus(ro0Var2);
        y30 y30Var2 = y30.f34832a;
        y30 y30Var3 = this.f16850c;
        int i2 = this.f16849b;
        if (y30Var == y30Var2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            y30Var = y30Var3;
        }
        return (z62.m13387o(ro0VarPlus, ro0Var2) && i == i2 && y30Var == y30Var3) ? this : mo3887d(ro0VarPlus, i, y30Var);
    }

    /* JADX INFO: renamed from: b */
    public String mo3885b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo3886c(mg3 mg3Var, wm0 wm0Var);

    @Override // p000.si1
    public Object collect(ti1 ti1Var, wm0 wm0Var) {
        Object objM13685q = zp0.m13685q(new C0671g0((Object) ti1Var, (Object) this, (wm0) null, (byte) 12), wm0Var);
        return objM13685q == ap0.f14763a ? objM13685q : ju4.f22634a;
    }

    /* JADX INFO: renamed from: d */
    public abstract d80 mo3887d(ro0 ro0Var, int i, y30 y30Var);

    /* JADX INFO: renamed from: g */
    public si1 mo3888g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public b80 mo3889h(zo0 zo0Var) {
        int i = this.f16849b;
        if (i == -3) {
            i = -2;
        }
        cp0 cp0Var = cp0.f16327c;
        mq1 c0594e0 = new C0594e0((Object) this, (wm0) null, (byte) 13);
        f40 f40VarM5333H = ev0.m5333H(i, this.f16850c, null, 4);
        mg3 mg3Var = new mg3(c20.m3796A(zo0Var, this.f16848a), true);
        mg3Var.f24885e = f40VarM5333H;
        VarHandle.storeStoreFence();
        mg3Var.m10957j0(cp0Var, mg3Var, c0594e0);
        return mg3Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo3885b = mo3885b();
        if (strMo3885b != null) {
            arrayList.add(strMo3885b);
        }
        r71 r71Var = r71.f29063a;
        ro0 ro0Var = this.f16848a;
        if (ro0Var != r71Var) {
            arrayList.add("context=" + ro0Var);
        }
        int i = this.f16849b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        y30 y30Var = y30.f34832a;
        y30 y30Var2 = this.f16850c;
        if (y30Var2 != y30Var) {
            arrayList.add("onBufferOverflow=" + y30Var2);
        }
        return getClass().getSimpleName() + '[' + hb0.m6305Q0(arrayList, ", ", null, null, 0, null, 62) + ']';
    }
}
