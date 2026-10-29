package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.C0055bw;
import ads_mobile_sdk.C0197ka;
import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.al3;
import ads_mobile_sdk.e62;
import ads_mobile_sdk.g44;
import ads_mobile_sdk.i44;
import ads_mobile_sdk.lx2;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1285w9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33163a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33164b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33165c;

    public /* synthetic */ RunnableC1285w9(byte b) {
        this.f33163a = b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        gx0 gx0Var;
        ArrayList arrayList;
        switch (this.f33163a) {
            case 0:
                ((AbstractC1323x9) this.f33164b).m12531t((o12) this.f33165c);
                return;
            case 1:
                oh6.m9111q((ViewOnAttachStateChangeListenerC0758id) this.f33164b, (LongSparseArray) this.f33165c);
                return;
            case 2:
                AbstractC1356y5.m12919m((g25) this.f33164b, ((UUID) this.f33165c).toString());
                return;
            case 3:
                ag0 ag0Var = (ag0) this.f33164b;
                t33 t33Var = (t33) this.f33165c;
                ok2 ok2Var = ag0Var.f14447a;
                tf0 tf0Var = new tf0();
                tf0Var.f31110a = t33Var;
                tf0Var.f31111b = ag0Var;
                VarHandle.storeStoreFence();
                ok2Var.mo6015a(tf0Var);
                return;
            case 4:
                z53 z53Var = (z53) this.f33164b;
                bi3 bi3Var = (bi3) this.f33165c;
                if (z53Var.f35760b != z53.f35758d) {
                    C1077qn.m9989o("provide() can be called only once.");
                    return;
                }
                synchronized (z53Var) {
                    gx0Var = z53Var.f35759a;
                    z53Var.f35759a = null;
                    z53Var.f35760b = bi3Var;
                    break;
                }
                gx0Var.mo6188c(bi3Var);
                return;
            case 5:
                wi2 wi2Var = (wi2) this.f33164b;
                bi3 bi3Var2 = (bi3) this.f33165c;
                synchronized (wi2Var) {
                    try {
                        if (wi2Var.f33408b == null) {
                            wi2Var.f33407a.add(bi3Var2);
                        } else {
                            wi2Var.f33408b.add(bi3Var2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 6:
                List<C0851kx> list = (List) this.f33164b;
                C0556cz c0556cz = (C0556cz) this.f33165c;
                for (C0851kx c0851kx : list) {
                    Object obj = c0556cz.f16624e;
                    C0508bz c0508bz = c0851kx.f23566a;
                    Object pl0Var = c0508bz.m3765d(obj) ? new pl0(c0508bz.m3764c()) : ol0.f26840a;
                    mg3 mg3Var = c0851kx.f23567b;
                    mg3Var.getClass();
                    mg3Var.mo5493n(pl0Var);
                }
                return;
            case 7:
                ((np0) this.f33164b).m8808b((String) this.f33165c, Boolean.FALSE);
                return;
            case 8:
                ns0 ns0Var = (ns0) this.f33164b;
                Runnable runnable = (Runnable) this.f33165c;
                Process.setThreadPriority(ns0Var.f26068c);
                StrictMode.ThreadPolicy threadPolicy = ns0Var.f26069d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 9:
                Callable callable = (Callable) this.f33164b;
                zx0 zx0Var = (zx0) ((ar3) this.f33165c).f14813b;
                try {
                    zx0Var.m7820k(callable.call());
                    return;
                } catch (Exception e) {
                    zx0Var.mo7821l(e);
                    return;
                }
            case 10:
                ((i85) this.f33165c).accept((vi4) ((ar3) this.f33164b).f14813b);
                return;
            case 11:
                ((b70) this.f33164b).m3481D((yu1) this.f33165c);
                return;
            case 12:
                ((wl0) this.f33164b).accept((vi4) this.f33165c);
                return;
            case 13:
                u72 u72Var = (u72) this.f33164b;
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) this.f33165c;
                x72 x72Var = u72Var.f31696b;
                m60 m60Var = u72Var.f31695a;
                x72Var.m12525l(m60Var);
                try {
                    m60Var.m8198a(zc6.m13510G(assetFileDescriptor, x72Var.f34036a, false));
                    return;
                } catch (IOException | UnsupportedOperationException e2) {
                    m60Var.m8199b(new g82("Retrieving result failed: " + e2.getMessage()));
                    return;
                } catch (yj2 e3) {
                    if (e3.getMessage() != null) {
                        m60Var.m8199b(new va1(e3.getMessage()));
                        return;
                    } else {
                        m60Var.m8199b(new va1());
                        return;
                    }
                }
            case 14:
                ((Context) this.f33164b).unbindService((l82) this.f33165c);
                return;
            case 15:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f33164b;
                JobParameters jobParameters = (JobParameters) this.f33165c;
                int i = JobInfoSchedulerService.f16210a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 16:
                ((g04) this.f33164b).m5880i((g43) this.f33165c, ju4.f22634a);
                return;
            case 17:
                jg3 jg3Var = (jg3) this.f33164b;
                e25 e25Var = (e25) this.f33165c;
                synchronized (jg3Var.f22256j) {
                    arrayList = new ArrayList(jg3Var.f22255i);
                    break;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((rb1) obj2).mo3084d(e25Var, false);
                }
                return;
            case 18:
                zn3 zn3Var = (zn3) this.f33164b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f33165c;
                try {
                    mp4.m8366a().f25118d.m12350e(((C0588dv) zn3Var.f36206h.f29651b).m4742b(ag3.f14487c), 1);
                    break;
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 19:
                ((pq3) ((C1283w7) this.f33164b).f33128d).m9615n((qb4) this.f33165c, 3);
                return;
            case 20:
                Runnable runnable2 = (Runnable) this.f33164b;
                po4 po4Var = (po4) this.f33165c;
                try {
                    runnable2.run();
                    return;
                } finally {
                    po4Var.m9596a();
                }
            case 21:
                if1 if1Var = (if1) this.f33164b;
                ((us2) if1Var.f21325b).m11647i((String) if1Var.f21324a, (List) this.f33165c);
                return;
            case 22:
                byte[] bArr = (byte[]) this.f33164b;
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.f33165c;
                try {
                    try {
                        autoCloseOutputStream.write(bArr);
                        autoCloseOutputStream.flush();
                        break;
                    } catch (IOException e4) {
                        Log.e("JavaScriptEngineUtils", "Writing to outputStream failed", e4);
                    }
                    return;
                } finally {
                    zc6.m13534t(autoCloseOutputStream);
                }
            case 23:
                ((C0310ra) this.f33164b).onSuccess((sz4) this.f33165c);
                return;
            case 24:
                ((C1040pn) this.f33164b).m9575m((sz4) this.f33165c);
                return;
            case 25:
                n35 n35Var = (n35) this.f33164b;
                gk2 gk2Var = (gk2) this.f33165c;
                if (n35Var.f25426c) {
                    return;
                }
                n35Var.f25427d = gk2Var;
                gk2Var.mo6015a(n35Var);
                return;
            case 26:
                al3 al3Var = (al3) this.f33164b;
                lx2 lx2Var = (lx2) this.f33165c;
                i44 i44Var = al3Var.f673a;
                i44Var.getClass();
                C0197ka c0197ka = i44Var.f4801c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    i44Var.m1262a(i44Var.m1261a(lx2Var));
                    c0197ka.f6144a.m1191a(3000, System.currentTimeMillis() - jCurrentTimeMillis, null, null);
                    new nr6().m8828l(Boolean.TRUE);
                    al3Var.f680h.set("2.996215036." + lx2Var.f7030a.m318y());
                    return;
                } catch (g44 e5) {
                    c0197ka.m1478a(e5.f3802a, System.currentTimeMillis() - jCurrentTimeMillis, e5);
                    throw new gf0(2);
                } catch (Exception e6) {
                    c0197ka.m1478a(4010, System.currentTimeMillis() - jCurrentTimeMillis, e6);
                    throw new gf0(2);
                }
            case 27:
                Integer num = (Integer) this.f33164b;
                Runnable runnable3 = (Runnable) this.f33165c;
                AbstractC0137h.m1113b(new C0055bw(num, (byte) 21));
                Process.setThreadPriority(num.intValue());
                runnable3.run();
                return;
            default:
                e62 e62Var = (e62) this.f33164b;
                String str = (String) this.f33165c;
                synchronized (e62Var) {
                    if (e62Var.f2809d.get()) {
                        return;
                    }
                    FrameLayout frameLayout = e62Var.f2808c;
                    Context context = frameLayout.getContext();
                    if (context != null) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        vd6.m11844c(context, frameLayout2, str);
                        frameLayout.addView(frameLayout2);
                        break;
                    }
                    return;
                }
        }
    }
}
