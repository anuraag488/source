package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.CloseGuard;
import android.util.Log;
import android.webkit.WebView;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m82 implements AutoCloseable {

    /* JADX INFO: renamed from: j */
    public static final AtomicBoolean f24723j = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a */
    public final Object f24724a = new Object();

    /* JADX INFO: renamed from: b */
    public final ar3 f24725b;

    /* JADX INFO: renamed from: c */
    public final wz1 f24726c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f24727d;

    /* JADX INFO: renamed from: e */
    public final Context f24728e;

    /* JADX INFO: renamed from: f */
    public Set f24729f;

    /* JADX INFO: renamed from: g */
    public int f24730g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f24731h;

    /* JADX INFO: renamed from: i */
    public final HashSet f24732i;

    public m82(Context context, l82 l82Var, wz1 wz1Var) {
        js1 js1Var = new js1();
        CloseGuard closeGuard = new CloseGuard();
        js1Var.f22555a = closeGuard;
        VarHandle.storeStoreFence();
        ar3 ar3Var = new ar3((byte) 13);
        ar3Var.f14813b = js1Var;
        VarHandle.storeStoreFence();
        this.f24725b = ar3Var;
        k82 k82Var = new k82((byte) 0);
        k82Var.f22982c = this;
        k82Var.f22981b = new AtomicInteger(1);
        VarHandle.storeStoreFence();
        this.f24731h = Executors.newCachedThreadPool(k82Var);
        this.f24728e = context;
        this.f24727d = new AtomicReference(l82Var);
        this.f24726c = wz1Var;
        uz1 uz1Var = (uz1) wz1Var;
        uz1Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(wz1.f33872kp);
            if (!uz1Var.f32265a.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method getSupportedFeatures is unimplemented.");
            }
            parcelObtain2.readException();
            ArrayList<String> arrayListCreateStringArrayList = parcelObtain2.createStringArrayList();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            HashSet hashSet = new HashSet();
            if (arrayListCreateStringArrayList.contains("ISOLATE_TERMINATION")) {
                hashSet.add("JS_FEATURE_ISOLATE_TERMINATION");
            }
            if (arrayListCreateStringArrayList.contains("WASM_FROM_ARRAY_BUFFER")) {
                hashSet.add("JS_FEATURE_PROMISE_RETURN");
                hashSet.add("JS_FEATURE_PROVIDE_CONSUME_ARRAY_BUFFER");
                hashSet.add("JS_FEATURE_WASM_COMPILATION");
            }
            if (arrayListCreateStringArrayList.contains("ISOLATE_MAX_HEAP_SIZE_LIMIT")) {
                hashSet.add("JS_FEATURE_ISOLATE_MAX_HEAP_SIZE");
            }
            if (arrayListCreateStringArrayList.contains("EVALUATE_WITHOUT_TRANSACTION_LIMIT")) {
                hashSet.add("JS_FEATURE_EVALUATE_WITHOUT_TRANSACTION_LIMIT");
            }
            if (arrayListCreateStringArrayList.contains("CONSOLE_MESSAGING")) {
                hashSet.add("JS_FEATURE_CONSOLE_MESSAGING");
            }
            if (arrayListCreateStringArrayList.contains("ISOLATE_CLIENT")) {
                hashSet.add("JS_FEATURE_ISOLATE_CLIENT");
            }
            if (arrayListCreateStringArrayList.contains("EVALUATE_FROM_FD")) {
                hashSet.add("JS_FEATURE_EVALUATE_FROM_FD");
            }
            if (arrayListCreateStringArrayList.contains("MESSAGE_PORTS")) {
                hashSet.add("JS_FEATURE_MESSAGE_PORTS");
            }
            this.f24732i = hashSet;
            this.f24729f = new HashSet();
            this.f24730g = 1;
            closeGuard.open("close");
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static p60 m8220a(Context context) {
        Objects.requireNonNull(context);
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null || !m8221g()) {
            throw new gf0("The system does not support JavaScriptSandbox");
        }
        ComponentName componentName = new ComponentName(currentWebViewPackage.packageName, "org.chromium.android_webview.js_sandbox.service.JsSandboxService0");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        C1163sz c1163sz = new C1163sz((byte) 8);
        c1163sz.f30676b = context;
        c1163sz.f30677c = intent;
        VarHandle.storeStoreFence();
        return AbstractC0647fd.m5686z(c1163sz);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8221g() {
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return currentWebViewPackage != null && currentWebViewPackage.getLongVersionCode() >= 511200000;
    }

    /* JADX INFO: renamed from: b */
    public final i82 m8222b() {
        i82 i82VarM6693b;
        q50 q50Var = new q50((byte) 11);
        synchronized (this.f24724a) {
            try {
                int iM4376u = d55.m4376u(this.f24730g);
                if (iM4376u == 0) {
                    try {
                        try {
                            i82VarM6693b = i82.m6692a(this, q50Var);
                        } catch (RemoteException | RuntimeException e) {
                            m8224j(e);
                            if (e instanceof RuntimeException) {
                                throw ((RuntimeException) e);
                            }
                            throw new RuntimeException(e);
                        }
                    } catch (DeadObjectException e2) {
                        m8224j(e2);
                        i82VarM6693b = i82.m6693b(this, "sandbox found dead during call to createIsolate");
                    }
                } else {
                    if (iM4376u != 1) {
                        if (iM4376u != 2) {
                            throw new AssertionError("unreachable");
                        }
                        throw new IllegalStateException("Cannot create isolate in closed sandbox");
                    }
                    i82VarM6693b = i82.m6693b(this, "sandbox was dead before call to createIsolate");
                }
                this.f24729f.add(i82VarM6693b);
            } catch (Throwable th) {
                throw th;
            }
        }
        return i82VarM6693b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Set set;
        synchronized (this.f24724a) {
            try {
                if (this.f24730g == 3) {
                    return;
                }
                l82 l82Var = (l82) this.f24727d.getAndSet(null);
                if (l82Var != null) {
                    this.f24728e.unbindService(l82Var);
                }
                f24723j.set(true);
                this.f24730g = 3;
                synchronized (this.f24724a) {
                    set = this.f24729f;
                    this.f24729f = Collections.EMPTY_SET;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((i82) it.next()).m6695g(new vi4(2, "sandbox closed"));
                }
                this.f24731h.shutdown();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final qz1 m8223e(q50 q50Var, h82 h82Var) {
        synchronized (this.f24724a) {
            try {
                if (this.f24732i.contains("JS_FEATURE_ISOLATE_CLIENT")) {
                    return ((uz1) this.f24726c).m11685F(h82Var);
                }
                boolean zContains = this.f24732i.contains("JS_FEATURE_ISOLATE_MAX_HEAP_SIZE");
                wz1 wz1Var = this.f24726c;
                if (zContains) {
                    return ((uz1) wz1Var).m11686G();
                }
                return ((uz1) wz1Var).m11684E();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            ((CloseGuard) ((js1) this.f24725b.f14813b).f22555a).warnIfOpen();
            close();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8224j(Exception exc) {
        if (exc instanceof DeadObjectException) {
            Log.e("JavaScriptSandbox", "Sandbox died before or during during remote call", exc);
        } else {
            Log.e("JavaScriptSandbox", "Killing sandbox due to exception", exc);
        }
        l82 l82Var = (l82) this.f24727d.getAndSet(null);
        Context context = this.f24728e;
        if (l82Var != null) {
            context.unbindService(l82Var);
        }
        Executor mainExecutor = context.getMainExecutor();
        RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 10);
        runnableC1054q0.f28115b = this;
        VarHandle.storeStoreFence();
        mainExecutor.execute(runnableC1054q0);
    }

    /* JADX INFO: renamed from: k */
    public final void m8225k() {
        int i;
        i82[] i82VarArr;
        synchronized (this.f24724a) {
            try {
                if (this.f24730g != 1) {
                    return;
                }
                this.f24730g = 2;
                l82 l82Var = (l82) this.f24727d.getAndSet(null);
                if (l82Var != null) {
                    this.f24728e.unbindService(l82Var);
                }
                synchronized (this.f24724a) {
                    i82VarArr = (i82[]) this.f24729f.toArray(new i82[0]);
                }
                for (i82 i82Var : i82VarArr) {
                    i82Var.m6696j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
