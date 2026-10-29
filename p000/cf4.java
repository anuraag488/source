package p000;

import android.database.sqlite.SQLiteDatabase;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cf4 implements pj3, xc3 {

    /* JADX INFO: renamed from: a */
    public ve4 f15983a;

    @Override // p000.xc3
    /* JADX INFO: renamed from: a */
    public final Object mo2968a(String str, yp1 yp1Var, ym0 ym0Var) {
        gf4 gf4VarM11887a = this.f15983a.m11887a(str);
        try {
            Object objInvoke = yp1Var.invoke(gf4VarM11887a);
            sc6.m10672m(gf4VarM11887a, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sc6.m10672m(gf4VarM11887a, th);
                throw th2;
            }
        }
    }

    @Override // p000.pj3
    /* JADX INFO: renamed from: b */
    public final ve4 mo2969b() {
        return this.f15983a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m4013c(of4 of4Var) {
        return Boolean.valueOf(this.f15983a.f32560a.m11595l());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m4014d(qo4 qo4Var, mq1 mq1Var, ym0 ym0Var) throws Throwable {
        bf4 bf4Var;
        cf4 cf4Var;
        uo1 uo1Var;
        if (ym0Var instanceof bf4) {
            bf4Var = (bf4) ym0Var;
            int i = bf4Var.f15244x;
            if ((i & Integer.MIN_VALUE) != 0) {
                bf4Var.f15244x = i - Integer.MIN_VALUE;
            } else {
                bf4Var = new bf4(this, ym0Var);
            }
        } else {
            bf4Var = new bf4(this, ym0Var);
        }
        Object obj = bf4Var.f15242v;
        Object obj2 = ap0.f14763a;
        int i2 = bf4Var.f15244x;
        if (i2 == 0) {
            k43.m7376J(obj);
            uo1 uo1Var2 = this.f15983a.f32560a;
            uo1Var2.m11595l();
            int iOrdinal = qo4Var.ordinal();
            if (iOrdinal == 0) {
                SQLiteDatabase sQLiteDatabase = uo1Var2.f32025a;
                pg2 pg2Var = uo1.f32024e;
                if (((Method) pg2Var.getValue()) != null) {
                    pg2 pg2Var2 = uo1.f32023d;
                    if (((Method) pg2Var2.getValue()) != null) {
                        Method method = (Method) pg2Var.getValue();
                        Object objInvoke = ((Method) pg2Var2.getValue()).invoke(sQLiteDatabase, null);
                        if (objInvoke != null) {
                            method.invoke(objInvoke, 0, null, 0, null);
                        } else {
                            C1077qn.m9989o("Required value was null.");
                        }
                    } else {
                        uo1Var2.m11589a();
                    }
                } else {
                    uo1Var2.m11589a();
                }
            } else if (iOrdinal == 1) {
                uo1Var2.m11590b();
            } else {
                if (iOrdinal != 2) {
                    C0670g.m5864c();
                    return null;
                }
                uo1Var2.m11589a();
            }
            try {
                try {
                    af4 af4Var = new af4();
                    af4Var.f14441a = this;
                    VarHandle.storeStoreFence();
                    bf4Var.f15240t = this;
                    bf4Var.f15241u = uo1Var2;
                    bf4Var.f15244x = 1;
                    Object objInvoke2 = mq1Var.invoke(af4Var, bf4Var);
                    if (objInvoke2 == obj2) {
                        return obj2;
                    }
                    cf4Var = this;
                    uo1Var = uo1Var2;
                    obj = objInvoke2;
                } catch (Throwable th) {
                    th = th;
                    cf4Var = this;
                    uo1Var = uo1Var2;
                    uo1Var.m11592g();
                    if (!uo1Var.m11595l()) {
                        cf4Var.getClass();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uo1Var = bf4Var.f15241u;
            cf4Var = bf4Var.f15240t;
            try {
                k43.m7376J(obj);
            } catch (Throwable th3) {
                th = th3;
                uo1Var.m11592g();
                if (!uo1Var.m11595l()) {
                    cf4Var.getClass();
                }
                throw th;
            }
        }
        uo1Var.m11596q();
        uo1Var.m11592g();
        if (!uo1Var.m11595l()) {
            cf4Var.getClass();
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final Object m4015e(qo4 qo4Var, mq1 mq1Var, of4 of4Var) {
        return m4014d(qo4Var, mq1Var, of4Var);
    }
}
