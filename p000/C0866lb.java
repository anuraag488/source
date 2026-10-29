package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: lb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0866lb extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f23902t;

    /* JADX INFO: renamed from: u */
    public boolean f23903u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f23904v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f23905w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ iq1 f23906x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0866lb(Object obj, Object obj2, iq1 iq1Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f23902t = b;
        this.f23904v = obj;
        this.f23905w = obj2;
        this.f23906x = iq1Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f23902t;
        ju4 ju4Var = ju4.f22634a;
        iq1 iq1Var = this.f23906x;
        Object obj2 = this.f23904v;
        switch (b) {
            case 0:
                oq1 oq1Var = (oq1) iq1Var;
                return new C0866lb((C0940nb) obj2, this.f23905w, oq1Var, (wm0) obj, (byte) 0).invokeSuspend(ju4Var);
            default:
                return new C0866lb((he0) obj2, (C0950nl) this.f23905w, (yp1) iq1Var, (wm0) obj, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Object objM10807c;
        byte b = this.f23902t;
        ju4 ju4Var = ju4.f22634a;
        iq1 iq1Var = this.f23906x;
        Object obj2 = this.f23905w;
        byte b2 = 2;
        Object obj3 = this.f23904v;
        wm0 wm0Var = null;
        byte b3 = 1;
        switch (b) {
            case 0:
                C0940nb c0940nb = (C0940nb) obj3;
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f23903u;
                if (!z) {
                    k43.m7376J(obj);
                    ((d83) c0940nb.f25609f).setValue(obj2);
                    C0756ib c0756ib = new C0756ib(b2);
                    c0756ib.f21241b = c0940nb;
                    VarHandle.storeStoreFence();
                    C0671g0 c0671g0 = new C0671g0(iq1Var, (Object) c0940nb, wm0Var, (byte) 4);
                    this.f23903u = true;
                    if (AbstractC0485bb.m3537d(c0756ib, c0671g0, this) == ap0Var) {
                        return ap0Var;
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                if (!((Boolean) ((yp1) c0940nb.f25605b).invoke(obj2)).booleanValue()) {
                    return ju4Var;
                }
                ((C0903mb) c0940nb.f25614k).m8259a(c0940nb.m8670h().m11656f(obj2), ((z73) c0940nb.f25613j).m13399h());
                ((d83) c0940nb.f25608e).setValue(obj2);
                ((d83) c0940nb.f25607d).setValue(obj2);
                return ju4Var;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f23903u;
                if (!z2) {
                    k43.m7376J(obj);
                    he0 he0Var = (he0) obj3;
                    if (he0Var != null) {
                        C0932n3 c0932n3 = new C0932n3((byte) 1);
                        c0932n3.f25415b = he0Var;
                        VarHandle.storeStoreFence();
                        vt0 vt0VarM10013H = qq2.m10013H(c0932n3);
                        C0969o3 c0969o3 = new C0969o3(b2, wm0Var, b3);
                        this.f23903u = true;
                        if (lb5.m7902J(vt0VarM10013H, c0969o3, this) == ap0Var2) {
                            return ap0Var2;
                        }
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                C0950nl c0950nl = (C0950nl) obj2;
                try {
                    Bundle bundle = new Bundle();
                    bundle.putLong("invocation_time_ms", SystemClock.elapsedRealtime());
                    bundle.putInt("omni.entry_point", 1);
                    bundle.putBoolean("micts_trigger", true);
                    Class<?> cls = Class.forName("com.android.internal.app.IVoiceInteractionManagerService");
                    Object objInvoke = Class.forName("com.android.internal.app.IVoiceInteractionManagerService$Stub").getMethod("asInterface", IBinder.class).invoke(null, Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "voiceinteraction"));
                    objM10807c = c0950nl.f25925f >= 34 ? lw1.m8122a(cls, objInvoke, null, bundle, new Integer(7), "hyperOS_home") : lw1.m8122a(cls, objInvoke, null, bundle, new Integer(7));
                    break;
                } catch (Throwable th) {
                    sc6.m10643O(th);
                    objM10807c = sj3.m10807c(th);
                }
                qq2.m10007B(objM10807c);
                yp1 yp1Var = (yp1) iq1Var;
                if (!(objM10807c instanceof yc1)) {
                    return ju4Var;
                }
                yp1Var.invoke("Couldn't open circle to search!");
                return ju4Var;
        }
    }
}
