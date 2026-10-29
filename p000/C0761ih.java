package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ih */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0761ih implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21415a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sw2 f21416b;

    public /* synthetic */ C0761ih(byte b) {
        this.f21415a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f21415a;
        ju4 ju4Var = ju4.f22634a;
        sw2 sw2Var = this.f21416b;
        switch (b) {
            case 0:
                sw2Var.setValue((cf2) obj);
                return ju4Var;
            case 1:
                C1039pm c1039pm = new C1039pm((byte) 0);
                c1039pm.f27741b = sw2Var;
                VarHandle.storeStoreFence();
                ((kz3) obj).m7753a("search", new pg0(-725062571, true, c1039pm));
                return ju4Var;
            case 2:
                sw2Var.setValue((xk4) obj);
                return ju4Var;
            case 3:
                sw2Var.setValue((cf2) obj);
                return ju4Var;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sw2Var.setValue(bool);
                return ju4Var;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                ((yp1) sw2Var.getValue()).invoke(f);
                return ju4Var;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                sw2Var.setValue(bool2);
                return ju4Var;
            case 7:
                sw2Var.setValue((xk4) obj);
                return ju4Var;
            case 8:
                sw2Var.setValue((cf2) obj);
                return ju4Var;
            case 9:
                int i = ox3.f27193g;
                sw2Var.setValue(null);
                return ju4Var;
            case 10:
                Float f2 = (Float) obj;
                f2.getClass();
                return Float.valueOf(((Number) ((yp1) sw2Var.getValue()).invoke(f2)).floatValue());
            case 11:
                cf2 cf2Var = (cf2) obj;
                sw2Var.setValue(AbstractC0647fd.m5672j(cf2Var.mo4007b(0L), z62.m13369a0(cf2Var.mo4004R())));
                return ju4Var;
            case 12:
                C1032pf c1032pf = new C1032pf((byte) 15);
                c1032pf.f27570b = sw2Var;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 13:
                ((yp1) sw2Var.getValue()).invoke((b33) obj);
                return ju4Var;
            case 14:
                sw2Var.setValue((cf2) obj);
                return ju4Var;
            default:
                sw2Var.setValue(b33.m3423a(((cf2) obj).mo4007b(0L)));
                return ju4Var;
        }
    }
}
