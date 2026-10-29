package p000;

import ads_mobile_sdk.v53;
import android.content.ComponentName;
import android.content.Intent;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ge0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f19752t;

    /* JADX INFO: renamed from: u */
    public byte f19753u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f19754v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f19755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge0(v53 v53Var, wm0 wm0Var, yp1 yp1Var) {
        super(1, wm0Var);
        this.f19752t = (byte) 4;
        this.f19754v = yp1Var;
        this.f19755w = v53Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f19752t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f19755w;
        Object obj3 = this.f19754v;
        switch (b) {
            case 0:
                return new ge0((u93) obj3, (C1354y3) obj2, (wm0) obj, (byte) 0).invokeSuspend(ju4Var);
            case 1:
                return new ge0((C1122rv) obj3, (ru0) obj2, (wm0) obj, (byte) 1).invokeSuspend(ju4Var);
            case 2:
                return new ge0((ru0) obj3, (mq1) obj2, (wm0) obj, (byte) 2).invokeSuspend(ju4Var);
            case 3:
                return new ge0((u93) obj3, (mq1) obj2, (wm0) obj, (byte) 3).invokeSuspend(ju4Var);
            default:
                return new ge0((v53) obj2, (wm0) obj, (yp1) obj3).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x012f, code lost:
    
        if (r14 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013b, code lost:
    
        if (r14 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0184, code lost:
    
        if (r13 == r0) goto L85;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM12816b;
        at0 at0Var;
        byte b = this.f19752t;
        ju4 ju4Var = ju4.f22634a;
        boolean z = false;
        z = false;
        Object obj2 = this.f19754v;
        Object obj3 = this.f19755w;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                Object obj4 = ap0.f14763a;
                byte b2 = this.f19753u;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    this.f19753u = (byte) 1;
                    obj = ((u93) obj2).mo11771c(this);
                    if (obj != obj4) {
                    }
                    return obj4;
                }
                if (b2 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                    objM12816b = ((ep3) obj).f18355a;
                }
                qq2.m10007B(objM12816b);
                if (objM12816b instanceof yc1) {
                    objM12816b = Boolean.FALSE;
                }
                if (((Boolean) objM12816b).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
                if (((Boolean) obj).booleanValue()) {
                    this.f19753u = (byte) 2;
                    objM12816b = ((C1354y3) obj3).m12816b(15);
                    break;
                }
                return Boolean.valueOf(z);
            case 1:
                C1122rv c1122rv = (C1122rv) obj2;
                ru0 ru0Var = (ru0) obj3;
                Object obj5 = ap0.f14763a;
                byte b3 = this.f19753u;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    ot0 ot0Var = new ot0(ru0Var, wm0Var, z ? (byte) 1 : (byte) 0);
                    List list = (List) c1122rv.f29654e;
                    if (list != null && !list.isEmpty()) {
                        c74 c74VarM10430c = ru0Var.m10430c();
                        yp1 rt0Var = new rt0(ru0Var, ot0Var, c1122rv, null);
                        this.f19753u = (byte) 2;
                        obj = c74VarM10430c.m3866b(rt0Var, this);
                        break;
                    } else {
                        this.f19753u = (byte) 1;
                        obj = ru0Var.m10435h(false, ot0Var, this);
                        break;
                    }
                    return obj5;
                }
                if (b3 == 1) {
                    k43.m7376J(obj);
                    at0Var = (at0) obj;
                } else {
                    if (b3 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                    at0Var = (at0) obj;
                }
                return ru0Var.f29632h.m10918c(at0Var);
            case 2:
                ru0 ru0Var2 = (ru0) obj2;
                ap0 ap0Var = ap0.f14763a;
                byte b4 = this.f19753u;
                wm0 wm0Var2 = null;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    this.f19753u = (byte) 1;
                    obj = null;
                } else {
                    if (b4 != 1) {
                        if (b4 == 2) {
                            k43.m7376J(obj);
                            return obj;
                        }
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                gh3 gh3Var = (gh3) obj;
                jv4 jv4Var = (jv4) getContext().get(gb5.f19724o);
                if (jv4Var != null) {
                    jv4Var.m7298c(ru0Var2);
                }
                jv4 jv4Var2 = new jv4();
                jv4Var2.f22694a = jv4Var;
                jv4Var2.f22695b = ru0Var2;
                VarHandle.storeStoreFence();
                C1031pe c1031pe = new C1031pe((Object) ru0Var2, obj3, (Object) gh3Var, wm0Var2, (byte) 10);
                this.f19753u = (byte) 2;
                Object objM7921b0 = lb5.m7921b0(jv4Var2, c1031pe, this);
                return objM7921b0 == ap0Var ? ap0Var : objM7921b0;
            case 3:
                Object obj6 = ap0.f14763a;
                byte b5 = this.f19753u;
                if (b5 == 0) {
                    k43.m7376J(obj);
                    this.f19753u = (byte) 1;
                    obj = ((u93) obj2).mo11771c(this);
                    if (obj != obj6) {
                    }
                    return obj6;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return ju4Var;
                }
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.queryentry.QueryEntryActivity"));
                this.f19753u = (byte) 2;
                if (((mq1) obj3).invoke(intent, this) != obj6) {
                    return ju4Var;
                }
                return obj6;
            default:
                v53 v53Var = (v53) obj3;
                Object obj7 = ap0.f14763a;
                byte b6 = this.f19753u;
                if (b6 == 0) {
                    k43.m7376J(obj);
                    this.f19753u = (byte) 1;
                    obj = ((yp1) obj2).invoke(this);
                    if (obj != obj7) {
                    }
                    return obj7;
                }
                if (b6 != 1) {
                    if (b6 == 2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                long jM6651j = i41.m6651j(((i41) obj).f21121a, v53Var.m2535f());
                this.f19753u = (byte) 2;
                if (v53.m2526a(jM6651j, v53Var, this) != obj7) {
                    return ju4Var;
                }
                return obj7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge0(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f19752t = b;
        this.f19754v = obj;
        this.f19755w = obj2;
    }
}
