package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class av0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14896a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ a44 f14897b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Context f14898c;

    public /* synthetic */ av0(byte b) {
        this.f14896a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        byte b = this.f14896a;
        ju4 ju4Var = ju4.f22634a;
        i50 i50Var = ki0.f23136a;
        switch (b) {
            case 0:
                a44 a44Var = this.f14897b;
                Context context = this.f14898c;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ir1Var.m6874W();
                } else {
                    boolean zM13181a = yn2.m13181a(a44Var);
                    boolean zM6890g = ir1Var.m6890g(a44Var) | ir1Var.m6894i(context);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        zu0 zu0Var = new zu0((byte) 3);
                        zu0Var.f36379b = a44Var;
                        zu0Var.f36380c = context;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(zu0Var);
                        obj4 = zu0Var;
                    }
                    mz3.m8466h(zM13181a, (yp1) obj4, null, null, false, null, null, k43.f22865b, null, ir1Var, 12582912, 892);
                }
                break;
            default:
                a44 a44Var2 = this.f14897b;
                Context context2 = this.f14898c;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    boolean zBooleanValue = ((Boolean) AbstractC1138sa.f30028c.m11153t(a44Var2, AbstractC1138sa.f30026a[0])).booleanValue();
                    boolean zM6890g2 = ir1Var2.m6890g(a44Var2) | ir1Var2.m6894i(context2);
                    Object objM6869O2 = ir1Var2.m6869O();
                    if (zM6890g2 || objM6869O2 == i50Var) {
                        obj5 = objM6869O2;
                        zu0 zu0Var2 = new zu0((byte) 2);
                        zu0Var2.f36379b = a44Var2;
                        zu0Var2.f36380c = context2;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(zu0Var2);
                        obj5 = zu0Var2;
                    }
                    mz3.m8466h(zBooleanValue, (yp1) obj5, null, null, false, null, null, k43.f22869l, null, ir1Var2, 12582912, 892);
                }
                break;
        }
        return ju4Var;
    }
}
