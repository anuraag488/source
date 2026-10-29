package p000;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ig1 implements gg0, pz4, hj3, fq3, g20, yk4, ey4, InterfaceC1094r3 {

    /* JADX INFO: renamed from: A */
    public static final ig1 f21362A;

    /* JADX INFO: renamed from: B */
    public static final ig1 f21363B;

    /* JADX INFO: renamed from: C */
    public static final ig1 f21364C;

    /* JADX INFO: renamed from: D */
    public static final ig1 f21365D;

    /* JADX INFO: renamed from: E */
    public static final ig1 f21366E;

    /* JADX INFO: renamed from: F */
    public static final ig1 f21367F;

    /* JADX INFO: renamed from: G */
    public static final ig1 f21368G;

    /* JADX INFO: renamed from: H */
    public static final ig1 f21369H;

    /* JADX INFO: renamed from: I */
    public static final ig1 f21370I;

    /* JADX INFO: renamed from: J */
    public static final ig1 f21371J;

    /* JADX INFO: renamed from: K */
    public static final ig1 f21372K;

    /* JADX INFO: renamed from: L */
    public static final ig1 f21373L;

    /* JADX INFO: renamed from: M */
    public static final ig1 f21374M;

    /* JADX INFO: renamed from: N */
    public static final ig1 f21375N;

    /* JADX INFO: renamed from: O */
    public static final ig1 f21376O;

    /* JADX INFO: renamed from: P */
    public static final ig1 f21377P;

    /* JADX INFO: renamed from: b */
    public static final C0853kz f21378b = new C0853kz(-1.0f, -1.0f);

    /* JADX INFO: renamed from: c */
    public static final C0853kz f21379c = new C0853kz(0.0f, -1.0f);

    /* JADX INFO: renamed from: d */
    public static final C0853kz f21380d = new C0853kz(1.0f, -1.0f);

    /* JADX INFO: renamed from: e */
    public static final C0853kz f21381e = new C0853kz(-1.0f, 0.0f);

    /* JADX INFO: renamed from: f */
    public static final C0853kz f21382f = new C0853kz(0.0f, 0.0f);

    /* JADX INFO: renamed from: g */
    public static final C0853kz f21383g = new C0853kz(1.0f, 0.0f);

    /* JADX INFO: renamed from: h */
    public static final C0853kz f21384h = new C0853kz(-1.0f, 1.0f);

    /* JADX INFO: renamed from: i */
    public static final C0853kz f21385i = new C0853kz(0.0f, 1.0f);

    /* JADX INFO: renamed from: j */
    public static final C0853kz f21386j = new C0853kz(1.0f, 1.0f);

    /* JADX INFO: renamed from: k */
    public static final C0816jz f21387k = new C0816jz(-1.0f);

    /* JADX INFO: renamed from: l */
    public static final C0816jz f21388l = new C0816jz(0.0f);

    /* JADX INFO: renamed from: m */
    public static final C0816jz f21389m = new C0816jz(1.0f);

    /* JADX INFO: renamed from: n */
    public static final C0779iz f21390n = new C0779iz(-1.0f);

    /* JADX INFO: renamed from: o */
    public static final C0779iz f21391o = new C0779iz(0.0f);

    /* JADX INFO: renamed from: p */
    public static final C0779iz f21392p = new C0779iz(1.0f);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ ig1 f21393q = new ig1(2);

    /* JADX INFO: renamed from: r */
    public static final ig1 f21394r = new ig1(3);

    /* JADX INFO: renamed from: s */
    public static final ig1 f21395s = new ig1(4);

    /* JADX INFO: renamed from: t */
    public static final ig1 f21396t = new ig1(5);

    /* JADX INFO: renamed from: u */
    public static final ig1 f21397u = new ig1(6);

    /* JADX INFO: renamed from: v */
    public static final String[] f21398v = new String[0];

    /* JADX INFO: renamed from: w */
    public static final ig1 f21399w;

    /* JADX INFO: renamed from: x */
    public static final ig1 f21400x;

    /* JADX INFO: renamed from: y */
    public static final ig1 f21401y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ ig1 f21402z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21403a;

    static {
        ig1 ig1Var = new ig1((byte) 8);
        VarHandle.storeStoreFence();
        f21399w = ig1Var;
        f21400x = new ig1((byte) 9);
        f21401y = new ig1((byte) 10);
        f21402z = new ig1((byte) 11);
        f21362A = new ig1((byte) 12);
        f21363B = new ig1((byte) 13);
        f21364C = new ig1((byte) 14);
        f21365D = new ig1((byte) 15);
        f21366E = new ig1((byte) 16);
        f21367F = new ig1((byte) 17);
        f21368G = new ig1((byte) 18);
        f21369H = new ig1((byte) 19);
        f21370I = new ig1((byte) 20);
        f21371J = new ig1((byte) 21);
        f21372K = new ig1((byte) 22);
        f21373L = new ig1((byte) 23);
        f21374M = new ig1((byte) 24);
        f21375N = new ig1((byte) 25);
        f21376O = new ig1((byte) 26);
        f21377P = new ig1((byte) 27);
    }

    public /* synthetic */ ig1(byte b) {
        this.f21403a = b;
    }

    @Override // p000.yk4
    /* JADX INFO: renamed from: a */
    public long mo5689a() {
        int i = pb0.f27502i;
        return pb0.f27501h;
    }

    @Override // p000.pz4
    /* JADX INFO: renamed from: b */
    public String[] mo6794b() {
        return f21398v;
    }

    @Override // p000.ey4
    /* JADX INFO: renamed from: c */
    public wp1 mo5421c(AbstractC1091r0 abstractC1091r0) {
        if (abstractC1091r0.isAttachedToWindow()) {
            lk2 lk2VarM13694z = zp0.m13694z(abstractC1091r0);
            if (lk2VarM13694z != null) {
                return i20.m6599x(abstractC1091r0, lk2VarM13694z.getLifecycle());
            }
            q32.m9722d("View tree for " + abstractC1091r0 + " has no ViewTreeLifecycleOwner");
            xy4.m12794w();
            return null;
        }
        ql3 ql3Var = new ql3();
        dy4 dy4Var = new dy4((byte) 0);
        dy4Var.f17507b = abstractC1091r0;
        dy4Var.f17508c = ql3Var;
        VarHandle.storeStoreFence();
        abstractC1091r0.addOnAttachStateChangeListener(dy4Var);
        jp1 jp1Var = new jp1((byte) 28);
        jp1Var.f22485b = abstractC1091r0;
        jp1Var.f22486c = dy4Var;
        VarHandle.storeStoreFence();
        ql3Var.f28555a = jp1Var;
        sj4 sj4Var = new sj4((byte) 6);
        sj4Var.f30344b = ql3Var;
        VarHandle.storeStoreFence();
        return sj4Var;
    }

    @Override // p000.pz4
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p000.g20
    /* JADX INFO: renamed from: d */
    public long mo5885d(xa0 xa0Var, int i) {
        return ((jl4) xa0Var.f34095e).m7183i(i);
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        return qs5.m10119x((Executor) c0602e8.mo4023g(new ni3(r00.class, Executor.class)));
    }

    @Override // p000.yk4
    /* JADX INFO: renamed from: f */
    public t30 mo5690f() {
        return null;
    }

    @Override // p000.pz4
    /* JADX INFO: renamed from: g */
    public void mo6795g(rz4 rz4Var, C1040pn c1040pn) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p000.pz4
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p000.pz4
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p000.pz4
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p000.yk4
    /* JADX INFO: renamed from: h */
    public float mo5691h() {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: k */
    public boolean m6796k(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    /* JADX INFO: renamed from: l */
    public Worker m6797l(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                Worker worker = (Worker) Class.forName(str).asSubclass(Worker.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                if (!worker.f14683d) {
                    return worker;
                }
                C1077qn.m9989o(zi4.m13622v("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
                return null;
            } catch (Throwable th) {
                wn2.m12326e().m12330d(x25.f33948a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            wn2.m12326e().m12330d(x25.f33948a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m6798m(String str, IOException iOException) {
        if (m6796k(3)) {
            Log.d("FirebaseCrashlytics", str, iOException);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m6799n(String str, Exception exc) {
        if (m6796k(6)) {
            Log.e("FirebaseCrashlytics", str, exc);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6800o(String str) {
        if (m6796k(4)) {
            Log.i("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6801p(String str) {
        if (m6796k(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6802q(String str, Exception exc) {
        if (m6796k(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    public String toString() {
        switch (this.f21403a) {
            case 10:
                return "coil.request.NullRequestData";
            default:
                return super.toString();
        }
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: i */
    public float mo6008i(float f) {
        return f;
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: j */
    public float mo6009j(float f) {
        return f;
    }
}
