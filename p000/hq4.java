package p000;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hq4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f20784t;

    /* JADX INFO: renamed from: u */
    public byte f20785u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f20786v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ mq4 f20787w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq4(mq4 mq4Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f20784t = b;
        this.f20787w = mq4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f20784t;
        mq4 mq4Var = this.f20787w;
        switch (b) {
            case 0:
                hq4 hq4Var = new hq4(mq4Var, wm0Var, (byte) 0);
                hq4Var.f20786v = obj;
                return hq4Var;
            default:
                hq4 hq4Var2 = new hq4(mq4Var, wm0Var, (byte) 1);
                hq4Var2.f20786v = obj;
                return hq4Var2;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20784t;
        ju4 ju4Var = ju4.f22634a;
        cf4 cf4Var = (cf4) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((hq4) create(wm0Var, cf4Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (r2.m4015e(r3, r5, r20) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0103, code lost:
    
        if (r0 == r1) goto L69;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cf4 cf4Var;
        Object objM4013c;
        Object objM4015e;
        cf4 cf4Var2;
        Object objM4013c2;
        w23[] w23VarArr;
        w23 w23Var;
        byte b = this.f20784t;
        mq4 mq4Var = this.f20787w;
        boolean z = true;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f20785u;
                try {
                    if (b2 == 0) {
                        k43.m7376J(obj);
                        cf4Var = (cf4) this.f20786v;
                        this.f20786v = cf4Var;
                        this.f20785u = (byte) 1;
                        objM4013c = cf4Var.m4013c(this);
                        if (objM4013c != ap0Var) {
                        }
                        return ap0Var;
                    }
                    if (b2 == 1) {
                        cf4Var = (cf4) this.f20786v;
                        k43.m7376J(obj);
                        objM4013c = obj;
                    } else {
                        if (b2 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                        objM4015e = obj;
                    }
                    return (Set) objM4015e;
                    if (!((Boolean) objM4013c).booleanValue()) {
                        qo4 qo4Var = qo4.f28645b;
                        vp4 vp4Var = new vp4(mq4Var, wm0Var, (byte) 1);
                        this.f20786v = null;
                        this.f20785u = (byte) 2;
                        objM4015e = cf4Var.m4015e(qo4Var, vp4Var, this);
                    }
                    break;
                } catch (SQLException unused) {
                }
                return b81.f15153a;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f20785u;
                ju4 ju4Var = ju4.f22634a;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    cf4Var2 = (cf4) this.f20786v;
                    this.f20786v = cf4Var2;
                    this.f20785u = (byte) 1;
                    objM4013c2 = cf4Var2.m4013c(this);
                    if (objM4013c2 != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (b3 == 1) {
                    cf4Var2 = (cf4) this.f20786v;
                    k43.m7376J(obj);
                    objM4013c2 = obj;
                } else {
                    if (b3 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
                if (!((Boolean) objM4013c2).booleanValue()) {
                    C1126rz c1126rz = (C1126rz) mq4Var.f25146g;
                    long[] jArr = (long[]) c1126rz.f29739c;
                    ReentrantLock reentrantLock = (ReentrantLock) c1126rz.f29738b;
                    reentrantLock.lock();
                    try {
                        if (c1126rz.f29737a) {
                            boolean z2 = false;
                            c1126rz.f29737a = false;
                            int length = jArr.length;
                            w23VarArr = new w23[length];
                            int i = 0;
                            boolean z3 = false;
                            while (i < length) {
                                if (jArr[i] > 0) {
                                    z2 = z;
                                }
                                boolean[] zArr = (boolean[]) c1126rz.f29740d;
                                if (z2 != zArr[i]) {
                                    zArr[i] = z2;
                                    w23Var = z2 ? w23.f33041b : w23.f33042c;
                                    z3 = true;
                                } else {
                                    w23Var = w23.f33040a;
                                }
                                w23VarArr[i] = w23Var;
                                i++;
                                z = true;
                                z2 = false;
                            }
                            if (!z3) {
                                w23VarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            w23VarArr = null;
                        }
                        if (w23VarArr != null) {
                            qo4 qo4Var2 = qo4.f28645b;
                            lq4 lq4Var = new lq4(w23VarArr, mq4Var, cf4Var2, null);
                            this.f20786v = null;
                            this.f20785u = (byte) 2;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                    break;
                }
                return ju4Var;
        }
    }
}
