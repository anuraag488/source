package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hh0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20572a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mq1 f20573b;

    public /* synthetic */ hh0(byte b) {
        this.f20572a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        lu3 lu3Var;
        byte b = this.f20572a;
        ju4 ju4Var = ju4.f22634a;
        mq1 mq1Var = this.f20573b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nt2 nt2VarM8579g = n74.m8579g(kt2.f23428a, 24.0f);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
                    int iHashCode = Long.hashCode(ir1Var.f21683T);
                    ga3 ga3VarM6902m = ir1Var.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM8579g);
                    bi0.f15310ap.getClass();
                    if (ir1Var.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var.m6893h0();
                    if (ir1Var.f21682S) {
                        ir1Var.m6900l(wf2.f33290T);
                    } else {
                        ir1Var.m6911q0();
                    }
                    C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    if (mq1Var == null) {
                        ir1Var.m6885d0(-1103848353);
                    } else {
                        ir1Var.m6885d0(1488412642);
                        mq1Var.invoke(ir1Var, 0);
                    }
                    ir1Var.m6912r(false);
                    ir1Var.m6912r(true);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (mq1Var == null) {
                        ir1Var2.m6885d0(-1733136964);
                    } else {
                        ir1Var2.m6885d0(1052471013);
                        mq1Var.invoke(ir1Var2, 0);
                    }
                    ir1Var2.m6912r(false);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 2:
                fu3 fu3Var = (fu3) obj;
                List list = (List) mq1Var.invoke(fu3Var, obj2);
                List list2 = list;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (lu3Var = fu3Var.f19322b) != null && !lu3Var.mo8110b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            case 3:
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mq1Var.invoke(ir1Var3, 0);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 4:
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mq1Var.invoke(ir1Var4, 0);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 5:
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mq1Var.invoke(ir1Var5, 0);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
            case 6:
                mi0 mi0Var6 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) mi0Var6;
                if (ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    mq1Var.invoke(ir1Var6, 0);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
            case 7:
                mi0 mi0Var7 = (mi0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ir1 ir1Var7 = (ir1) mi0Var7;
                if (ir1Var7.m6871T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mq1Var.invoke(ir1Var7, 0);
                } else {
                    ir1Var7.m6874W();
                }
                return ju4Var;
            case 8:
                mi0 mi0Var8 = (mi0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ir1 ir1Var8 = (ir1) mi0Var8;
                if (ir1Var8.m6871T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    mq1Var.invoke(ir1Var8, 0);
                } else {
                    ir1Var8.m6874W();
                }
                return ju4Var;
            default:
                mi0 mi0Var9 = (mi0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ir1 ir1Var9 = (ir1) mi0Var9;
                if (ir1Var9.m6871T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mq1Var.invoke(ir1Var9, 0);
                } else {
                    ir1Var9.m6874W();
                }
                return ju4Var;
        }
    }
}
