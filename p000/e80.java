package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class e80 extends d80 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ byte f17873d;

    /* JADX INFO: renamed from: e */
    public final Object f17874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e80(Object obj, ro0 ro0Var, int i, y30 y30Var, byte b) {
        super(ro0Var, i, y30Var);
        this.f17873d = b;
        this.f17874e = obj;
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: c */
    public Object mo3886c(mg3 mg3Var, wm0 wm0Var) {
        byte b = this.f17873d;
        ju4 ju4Var = ju4.f22634a;
        Object obj = this.f17874e;
        switch (b) {
            case 0:
                Object objInvoke = ((mq1) obj).invoke(mg3Var, wm0Var);
                return objInvoke == ap0.f14763a ? objInvoke : ju4Var;
            default:
                z14 z14Var = new z14(mg3Var);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    lb5.m7910S(mg3Var, null, null, new C0594e0(it.next(), (Object) z14Var, (wm0) null, (byte) 15), 3);
                }
                return ju4Var;
        }
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: d */
    public d80 mo3887d(ro0 ro0Var, int i, y30 y30Var) {
        byte b = this.f17873d;
        Object obj = this.f17874e;
        switch (b) {
            case 0:
                return new e80((mq1) obj, ro0Var, i, y30Var, (byte) 0);
            default:
                return new e80((Iterable) obj, ro0Var, i, y30Var, (byte) 1);
        }
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: h */
    public b80 mo3889h(zo0 zo0Var) {
        switch (this.f17873d) {
            case 1:
                mq1 c0594e0 = new C0594e0((Object) this, (wm0) null, (byte) 13);
                y30 y30Var = y30.f34832a;
                cp0 cp0Var = cp0.f16325a;
                f40 f40VarM5333H = ev0.m5333H(this.f16849b, y30Var, null, 4);
                mg3 mg3Var = new mg3(c20.m3796A(zo0Var, this.f16848a), true);
                mg3Var.f24885e = f40VarM5333H;
                VarHandle.storeStoreFence();
                mg3Var.m10957j0(cp0Var, mg3Var, c0594e0);
                return mg3Var;
            default:
                return super.mo3889h(zo0Var);
        }
    }

    @Override // p000.d80
    public String toString() {
        switch (this.f17873d) {
            case 0:
                return "block[" + ((mq1) this.f17874e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
