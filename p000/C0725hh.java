package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: hh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0725hh implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20570a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sw2 f20571b;

    public /* synthetic */ C0725hh(byte b) {
        this.f20570a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f20570a;
        ju4 ju4Var = ju4.f22634a;
        sw2 sw2Var = this.f20571b;
        switch (b) {
            case 0:
                cf2 cf2Var = (cf2) sw2Var.getValue();
                if (cf2Var != null) {
                    return cf2Var;
                }
                t32.m10971d("Required value was null.");
                xy4.m12794w();
                return null;
            case 1:
                return Integer.valueOf(((Number) sw2Var.getValue()).intValue());
            case 2:
                sw2Var.setValue(Boolean.FALSE);
                return ju4Var;
            case 3:
                cf2 cf2Var2 = (cf2) sw2Var.getValue();
                if (cf2Var2 != null) {
                    return cf2Var2;
                }
                t32.m10971d("Required value was null.");
                xy4.m12794w();
                return null;
            case 4:
                Boolean bool = (Boolean) sw2Var.getValue();
                bool.booleanValue();
                return bool;
            case 5:
                sw2Var.setValue(Boolean.FALSE);
                return ju4Var;
            case 6:
                return (xp4) sw2Var.getValue();
            case 7:
                return (sp1) sw2Var.getValue();
            case 8:
                return (sp1) sw2Var.getValue();
            case 9:
                return (sp1) sw2Var.getValue();
            case 10:
                return (hi2) ((wp1) sw2Var.getValue()).invoke();
            case 11:
                yp1 yp1Var = (yp1) sw2Var.getValue();
                fi2 fi2Var = new fi2();
                C0795je c0795je = new C0795je((byte) 3);
                c0795je.f22194c = new uw2(new r62[16]);
                VarHandle.storeStoreFence();
                fi2Var.f19015a = c0795je;
                yp1Var.invoke(fi2Var);
                VarHandle.storeStoreFence();
                return fi2Var;
            case 12:
                Boolean bool2 = (Boolean) sw2Var.getValue();
                bool2.getClass();
                return bool2;
            case 13:
                sw2Var.setValue(Boolean.valueOf(!((Boolean) sw2Var.getValue()).booleanValue()));
                return ju4Var;
            case 14:
                cf2 cf2Var3 = (cf2) sw2Var.getValue();
                if (cf2Var3 != null) {
                    return cf2Var3;
                }
                t32.m10971d("Required value was null.");
                xy4.m12794w();
                return null;
            default:
                return (cf2) sw2Var.getValue();
        }
    }
}
