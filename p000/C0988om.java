package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: om */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0988om implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26870a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f26871b;

    public /* synthetic */ C0988om(byte b) {
        this.f26870a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26870a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        switch (b) {
            case 0:
                String str = this.f26871b;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    gl4.m6037b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 262142);
                }
                break;
            case 1:
                String str2 = this.f26871b;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    if (str2 == null) {
                        ir1Var2.m6885d0(214179815);
                    } else {
                        ir1Var2.m6885d0(214179816);
                        gl4.m6037b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var2, 0, 0, 262142);
                    }
                    ir1Var2.m6912r(false);
                }
                break;
            case 2:
                String str3 = this.f26871b;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ir1Var3.m6874W();
                } else {
                    C0988om c0988om = new C0988om(b2);
                    c0988om.f26871b = str3;
                    VarHandle.storeStoreFence();
                    gq6.m6079d(null, null, null, null, vd6.m11834R(-500839254, c0988om, ir1Var3), ir1Var3, 196608);
                }
                break;
            case 3:
                String str4 = this.f26871b;
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (!ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ir1Var4.m6874W();
                } else {
                    gl4.m6037b(str4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var4, 0, 0, 262142);
                }
                break;
            case 4:
                String str5 = this.f26871b;
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (!ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ir1Var5.m6874W();
                } else {
                    gl4.m6037b(str5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var5, 0, 0, 262142);
                }
                break;
            case 5:
                String str6 = this.f26871b;
                mi0 mi0Var6 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) mi0Var6;
                if (!ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ir1Var6.m6874W();
                } else {
                    gl4.m6037b(str6, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var6, 0, 0, 262142);
                }
                break;
            default:
                String str7 = this.f26871b;
                mi0 mi0Var7 = (mi0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ir1 ir1Var7 = (ir1) mi0Var7;
                if (!ir1Var7.m6871T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ir1Var7.m6874W();
                } else {
                    gl4.m6037b(str7, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var7, 0, 0, 262142);
                }
                break;
        }
        return ju4Var;
    }
}
