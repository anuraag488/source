package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: mm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0914mm implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25017a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f25018b;

    public /* synthetic */ C0914mm(byte b) {
        this.f25017a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f25017a;
        ju4 ju4Var = ju4.f22634a;
        boolean z = false;
        switch (b) {
            case 0:
                String str = this.f25018b;
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    nt2 nt2VarM3253l = as4.m3253l(sg2Var, ir1Var);
                    C0988om c0988om = new C0988om(z ? (byte) 1 : (byte) 0);
                    c0988om.f26871b = str;
                    VarHandle.storeStoreFence();
                    mz3.m8462d(nt2VarM3253l, false, vd6.m11834R(-294341762, c0988om, ir1Var), ir1Var, 384, 2);
                }
                break;
            case 1:
                String str2 = this.f25018b;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    C0988om c0988om2 = new C0988om((byte) 3);
                    c0988om2.f26871b = str2;
                    VarHandle.storeStoreFence();
                    AbstractC0647fd.m5673k(null, vd6.m11834R(-157277223, c0988om2, ir1Var2), ir1Var2, 384);
                }
                break;
            case 2:
                String str3 = this.f25018b;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ir1Var3.m6874W();
                } else {
                    gl4.m6037b(str3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var3, 0, 0, 262142);
                }
                break;
            case 3:
                String str4 = this.f25018b;
                bo4 bo4Var = (bo4) obj;
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? ((ir1) mi0Var4).m6890g(bo4Var) : ((ir1) mi0Var4).m6894i(bo4Var) ? 4 : 2;
                }
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (!ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ir1Var4.m6874W();
                } else {
                    C0988om c0988om3 = new C0988om((byte) 5);
                    c0988om3.f26871b = str4;
                    VarHandle.storeStoreFence();
                    zn4.m13647b(bo4Var, str4, null, 0.0f, null, 0L, 0L, vd6.m11834R(660974002, c0988om3, ir1Var4), ir1Var4, iIntValue4 & 14);
                }
                break;
            default:
                String str5 = this.f25018b;
                mi0 mi0Var5 = (mi0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (!ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ir1Var5.m6874W();
                } else {
                    C0988om c0988om4 = new C0988om((byte) 6);
                    c0988om4.f26871b = str5;
                    VarHandle.storeStoreFence();
                    mz3.m8462d(null, false, vd6.m11834R(-1533337855, c0988om4, ir1Var5), ir1Var5, 384, 3);
                }
                break;
        }
        return ju4Var;
    }
}
