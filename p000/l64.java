package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l64 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23820a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23821b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mq1 f23822c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f23823d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f23824e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f23825f;

    public /* synthetic */ l64(byte b) {
        this.f23820a = b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f23820a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 0;
        switch (b) {
            case 0:
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
                }
                byte b3 = 1;
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    i64 i64Var = (i64) this.f23821b;
                    ir1Var.m6885d0(266239790);
                    pw3 pw3VarM10148d = qw3.m10148d(ir1Var);
                    mq1 mq1Var = this.f23822c;
                    yp1 yp1Var = (yp1) this.f23823d;
                    Context context = (Context) this.f23825f;
                    yp1 yp1Var2 = (yp1) this.f23824e;
                    m64 m64Var = new m64();
                    m64Var.f24687a = pw3VarM10148d;
                    m64Var.f24688b = mq1Var;
                    m64Var.f24689c = i64Var;
                    m64Var.f24690d = yp1Var;
                    m64Var.f24691e = context;
                    m64Var.f24692f = yp1Var2;
                    VarHandle.storeStoreFence();
                    k64 k64Var = new k64(b2);
                    k64Var.f22943b = i64Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(1755226951, k64Var, ir1Var);
                    k64 k64Var2 = new k64(b3);
                    k64Var2.f22943b = i64Var;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, m64Var, null, null, pg0VarM11834R, null, vd6.m11834R(602729221, k64Var2, ir1Var), null, ir1Var, 102236160, 695);
                    ir1Var.m6912r(false);
                }
                break;
            default:
                v20 v20Var = (v20) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(v20Var) ? 4 : 2;
                }
                if ((iIntValue2 & 91) != 18) {
                    nl0 nl0Var = (nl0) ((p74) this.f23821b);
                    long j = v20Var.f32325b;
                    ac4 ac4Var = nl0Var.f25926a;
                    kl0 kl0VarM7531a = kl0.m7531a(j);
                    ac4Var.getClass();
                    ac4Var.m200k(null, kl0VarM7531a);
                    ((pg0) this.f23822c).invoke(new vk3(v20Var, (C0880lp) this.f23823d, (InterfaceC0520ca) this.f23824e, (jm0) this.f23825f), mi0Var2, 0);
                } else {
                    ir1 ir1Var2 = (ir1) mi0Var2;
                    if (!ir1Var2.m6858D()) {
                        nl0 nl0Var2 = (nl0) ((p74) this.f23821b);
                        long j2 = v20Var.f32325b;
                        ac4 ac4Var2 = nl0Var2.f25926a;
                        kl0 kl0VarM7531a2 = kl0.m7531a(j2);
                        ac4Var2.getClass();
                        ac4Var2.m200k(null, kl0VarM7531a2);
                        ((pg0) this.f23822c).invoke(new vk3(v20Var, (C0880lp) this.f23823d, (InterfaceC0520ca) this.f23824e, (jm0) this.f23825f), mi0Var2, 0);
                    } else {
                        ir1Var2.m6874W();
                    }
                }
                break;
        }
        return ju4Var;
    }
}
