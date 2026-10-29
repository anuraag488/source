package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tt1 implements Handler.Callback {

    /* JADX INFO: renamed from: o */
    public static final Status f31407o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: p */
    public static final Status f31408p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: q */
    public static final Object f31409q = new Object();

    /* JADX INFO: renamed from: r */
    public static tt1 f31410r;

    /* JADX INFO: renamed from: a */
    public long f31411a;

    /* JADX INFO: renamed from: b */
    public boolean f31412b;

    /* JADX INFO: renamed from: c */
    public ri4 f31413c;

    /* JADX INFO: renamed from: d */
    public hm5 f31414d;

    /* JADX INFO: renamed from: e */
    public final Context f31415e;

    /* JADX INFO: renamed from: f */
    public final pt1 f31416f;

    /* JADX INFO: renamed from: g */
    public final yg3 f31417g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f31418h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f31419i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f31420j;

    /* JADX INFO: renamed from: k */
    public final C0879lo f31421k;

    /* JADX INFO: renamed from: l */
    public final C0879lo f31422l;

    /* JADX INFO: renamed from: m */
    public final km5 f31423m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f31424n;

    public tt1(Context context, Looper looper) {
        pt1 pt1Var = pt1.f27970d;
        this.f31411a = 10000L;
        this.f31412b = false;
        this.f31418h = new AtomicInteger(1);
        this.f31419i = new AtomicInteger(0);
        this.f31420j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f31421k = new C0879lo(0);
        this.f31422l = new C0879lo(0);
        this.f31424n = true;
        this.f31415e = context;
        km5 km5Var = new km5(looper, this);
        Looper.getMainLooper();
        this.f31423m = km5Var;
        this.f31416f = pt1Var;
        yg3 yg3Var = new yg3((byte) 11);
        yg3Var.f35215b = new SparseIntArray();
        yg3Var.f35216c = pt1Var;
        VarHandle.storeStoreFence();
        this.f31417g = yg3Var;
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = AbstractC0647fd.f18919i;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            AbstractC0647fd.f18919i = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.f31424n = false;
        }
        km5Var.sendMessage(km5Var.obtainMessage(6));
    }

    /* JADX INFO: renamed from: c */
    public static Status m11133c(C0458al c0458al, lk0 lk0Var) {
        return new Status(17, c75.m3879k("API: ", (String) c0458al.f14605b.f25811c, " is not available on this device. Connection failed with: ", String.valueOf(lk0Var)), lk0Var.f24098f, lk0Var);
    }

    /* JADX INFO: renamed from: e */
    public static tt1 m11134e(Context context) {
        tt1 tt1Var;
        HandlerThread handlerThread;
        synchronized (f31409q) {
            tt1Var = f31410r;
            if (tt1Var == null) {
                synchronized (tn6.f31276g) {
                    try {
                        handlerThread = tn6.f31278i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            tn6.f31278i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = tn6.f31278i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = pt1.f27969c;
                tt1 tt1Var2 = new tt1(applicationContext, looper);
                f31410r = tt1Var2;
                tt1Var = tt1Var2;
            }
        }
        return tt1Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11135a() {
        if (this.f31412b) {
            return false;
        }
        br3 br3Var = (br3) ar3.m3127r().f14813b;
        if (br3Var != null && !br3Var.f15525e) {
            return false;
        }
        int i = ((SparseIntArray) this.f31417g.f35215b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11136b(lk0 lk0Var, int i) {
        pt1 pt1Var = this.f31416f;
        pt1Var.getClass();
        Context context = this.f31415e;
        if (!y42.m12872u0(context)) {
            int i2 = lk0Var.f24097e;
            PendingIntent activity = lk0Var.f24098f;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentMo9664a = pt1Var.mo9664a(context, i2, null);
                if (intentMo9664a != null) {
                    activity = PendingIntent.getActivity(context, 0, intentMo9664a, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.f16224b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                pt1Var.m9666d(context, i2, PendingIntent.getActivity(context, 0, intent, 167772160));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final ol5 m11137d(ot1 ot1Var) {
        C0458al c0458al = ot1Var.f27080e;
        ConcurrentHashMap concurrentHashMap = this.f31420j;
        ol5 ol5Var = (ol5) concurrentHashMap.get(c0458al);
        if (ol5Var == null) {
            ol5 ol5Var2 = new ol5();
            ol5Var2.f26868m = this;
            ol5Var2.f26856a = new LinkedList();
            ol5Var2.f26860e = new HashSet();
            ol5Var2.f26861f = new HashMap();
            ol5Var2.f26865j = new ArrayList();
            xl5 xl5Var = null;
            ol5Var2.f26866k = null;
            ol5Var2.f26867l = 0;
            km5 km5Var = this.f31423m;
            Looper looper = km5Var.getLooper();
            C0602e8 c0602e8M12140l = ot1Var.m9263b().m12140l();
            InterfaceC1074qk interfaceC1074qkMo6631i = ((i25) ot1Var.f27078c.f25810b).mo6631i(ot1Var.f27076a, looper, c0602e8M12140l, ot1Var.f27079d, ol5Var2, ol5Var2);
            String str = ot1Var.f27077b;
            if (str != null && (interfaceC1074qkMo6631i instanceof AbstractC1235ux)) {
                ((AbstractC1235ux) interfaceC1074qkMo6631i).setAttributionTag(str);
            }
            if (str != null && (interfaceC1074qkMo6631i instanceof m13)) {
                c75.m3884p(interfaceC1074qkMo6631i);
                throw null;
            }
            ol5Var2.f26857b = interfaceC1074qkMo6631i;
            ol5Var2.f26858c = ot1Var.f27080e;
            pq3 pq3Var = new pq3((byte) 8);
            pq3Var.f27896b = Collections.synchronizedMap(new WeakHashMap());
            pq3Var.f27897c = Collections.synchronizedMap(new WeakHashMap());
            VarHandle.storeStoreFence();
            ol5Var2.f26859d = pq3Var;
            ol5Var2.f26862g = ot1Var.f27081f;
            if (interfaceC1074qkMo6631i.requiresSignIn()) {
                C0602e8 c0602e8M12140l2 = ot1Var.m9263b().m12140l();
                ll5 ll5Var = xl5.f34392q;
                xl5Var = new xl5("com.google.android.gms.signin.internal.ISignInCallbacks", (byte) 1);
                xl5Var.f34393j = this.f31415e;
                xl5Var.f34394k = km5Var;
                xl5Var.f34397n = c0602e8M12140l2;
                xl5Var.f34396m = (Set) c0602e8M12140l2.f17868b;
                xl5Var.f34395l = ll5Var;
                VarHandle.storeStoreFence();
            }
            ol5Var2.f26863h = xl5Var;
            VarHandle.storeStoreFence();
            concurrentHashMap.put(c0458al, ol5Var2);
            ol5Var = ol5Var2;
        }
        if (ol5Var.f26857b.requiresSignIn()) {
            this.f31422l.add(c0458al);
        }
        ol5Var.m9178j();
        return ol5Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m11138f(lk0 lk0Var, int i) {
        if (m11136b(lk0Var, i)) {
            return;
        }
        km5 km5Var = this.f31423m;
        km5Var.sendMessage(km5Var.obtainMessage(5, i, 0, lk0Var));
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0314  */
    /* JADX WARN: Code duplicated, block: B:163:0x031a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0338  */
    /* JADX WARN: Code duplicated, block: B:167:0x0342  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ol5, still in use, count: 2, list:
          (r2v10 ol5) from 0x030c: IGET (r2v10 ol5) A[WRAPPED] (LINE:781) ol5.g int
          (r2v10 ol5) from 0x0312: PHI (r2 I:??) = (r2v7 ol5), (r2v10 ol5) binds: [B:159:0x0311, B:213:0x0312] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tt1.handleMessage(android.os.Message):boolean");
    }
}
