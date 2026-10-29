package p000;

import ads_mobile_sdk.C0015a;
import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.C0314rk;
import ads_mobile_sdk.C0434za;
import ads_mobile_sdk.EnumC0165io;
import ads_mobile_sdk.a34;
import ads_mobile_sdk.hs0;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.lx3;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.oz1;
import ads_mobile_sdk.ts0;
import ads_mobile_sdk.zx2;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sj0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30324a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30325b;

    public /* synthetic */ sj0(byte b) {
        this.f30324a = b;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00eb: INVOKE (r4 I:ads_mobile_sdk.lx3) VIRTUAL call: ads_mobile_sdk.lx3.a():void A[Catch: all -> 0x00e9, MD:():void (m), TRY_ENTER] (LINE:236), block:B:68:0x00eb */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileInputStream fileInputStreamOpenFileInput;
        lx3 lx3VarM1628a;
        Object objApply;
        Object objM2091a;
        boolean z = false;
        FileInputStream fileInputStream = null;
        wj0 wj0VarM12308a = null;
        switch (this.f30324a) {
            case 0:
                hk0 hk0Var = (hk0) this.f30325b;
                synchronized (hk0Var) {
                    try {
                        try {
                            fileInputStreamOpenFileInput = hk0Var.f20633a.openFileInput(hk0Var.f20634b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                wj0VarM12308a = wj0.m12308a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStreamOpenFileInput;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException | JSONException unused2) {
                            fileInputStreamOpenFileInput = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return wj0VarM12308a;
            case 1:
                np0 np0Var = ((rp0) this.f30325b).f29501g;
                np0Var.getClass();
                jp0.m7209m();
                z32 z32Var = np0Var.f25995c;
                if1 if1Var = (if1) z32Var.f35739c;
                String str = (String) z32Var.f35738b;
                if1Var.getClass();
                if (!new File((File) if1Var.f21326c, str).exists()) {
                    NavigableSet navigableSetM12373c = ((wq0) np0Var.f26005m.f17868b).m12373c();
                    if ((navigableSetM12373c.isEmpty() ? null : (String) navigableSetM12373c.first()) != null && np0Var.f26002j.m10890c()) {
                    }
                    return Boolean.valueOf(z);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                }
                if1 if1Var2 = (if1) z32Var.f35739c;
                if1Var2.getClass();
                new File((File) if1Var2.f21326c, str).delete();
                z = true;
                return Boolean.valueOf(z);
            case 2:
                JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) this.f30325b;
                j82 j82Var = new j82();
                j82Var.f22087a = jsReplyProxyBoundaryInterface;
                VarHandle.storeStoreFence();
                return j82Var;
            case 3:
                return ((vm3) this.f30325b).m11935a();
            case 4:
                C1372yl c1372yl = (C1372yl) ((yg3) this.f30325b).f35216c;
                C0973o7 c0973o7 = (C0973o7) c1372yl.f35309f;
                j44 j44Var = (j44) c1372yl.f35305b;
                c0973o7.getClass();
                ig1 ig1Var = ig1.f21399w;
                jp0.m7210n();
                try {
                    HashMap mapM8973h = C0973o7.m8973h(j44Var);
                    jp0 jp0VarM8974g = c0973o7.m8974g(mapM8973h);
                    C0973o7.m8972c(jp0VarM8974g, j44Var);
                    ig1Var.m6798m("Requesting settings from ".concat(c0973o7.f26402b), null);
                    ig1Var.m6801p("Settings query params were: " + mapM8973h);
                    return c0973o7.m8975i(jp0VarM8974g.m7246s());
                } catch (IOException e) {
                    ig1Var.m6799n("Settings request failed.", e);
                    return null;
                }
            case 5:
                a34 a34Var = (a34) this.f30325b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                a34Var.f363a.registerReceiver(a34Var, intentFilter);
                return null;
            case 6:
                hs0 hs0Var = (hs0) this.f30325b;
                ((C0015a) hs0Var.f4580c.get()).m207a();
                oz1 oz1Var = (oz1) hs0Var.f4579b.get();
                synchronized (oz1Var) {
                    try {
                        oy3 oy3Var = oz1Var.f8420e;
                        lx3 lx3Var = new lx3(ir0.f5205I, oy3Var.f8415b, oy3Var.f8414a);
                        try {
                            lx3Var.m1630b();
                            oz1Var.m1898a();
                            oz1Var.m1900c();
                            oz1Var.m1902d();
                            oz1Var.f8425j = true;
                        } catch (j95 e2) {
                            lx3Var.m1629a(e2);
                        } catch (Throwable th4) {
                            lx3Var.m1629a(th4);
                            throw th4;
                        }
                        lx3Var.m1628a();
                    } catch (Throwable th5) {
                        lx3VarM1628a.m1628a();
                        throw th5;
                    }
                    break;
                }
                return null;
            case 7:
                return (EnumC0165io) ((pm5) this.f30325b).get();
            case 8:
                C0314rk c0314rk = (C0314rk) this.f30325b;
                nc5 nc5Var = new nc5((byte) 4);
                nc5Var.f25687b = c0314rk;
                VarHandle.storeStoreFence();
                synchronized (c0314rk) {
                    oy3 oy3Var2 = c0314rk.f10861b;
                    ir0 ir0Var = ir0.f5311h;
                    Context context = c0314rk.f10860a;
                    C0434za c0434za = c0314rk.f10862c;
                    C1163sz c1163sz = new C1163sz((byte) 20);
                    c1163sz.f30676b = context;
                    c1163sz.f30677c = c0434za;
                    VarHandle.storeStoreFence();
                    C1167t2 c1167t2M11207u = AbstractRunnableC1204u2.m11207u(AbstractC0647fd.m5686z(c1163sz), nc5Var, c0314rk.f10863d);
                    oy3Var2.m1892a(ir0Var, (ik1) c1167t2M11207u);
                    c0314rk.f10865f = c1167t2M11207u;
                    break;
                }
                return "";
            default:
                ts0 ts0Var = (ts0) this.f30325b;
                synchronized (ts0Var) {
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream2 = new FileInputStream(ts0Var.f12083a);
                                try {
                                    objM2091a = ts0Var.f12085c.m2091a(fileInputStream2);
                                    fileInputStream2.close();
                                } catch (Throwable th6) {
                                    try {
                                        fileInputStream2.close();
                                        break;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                    }
                                    throw th6;
                                }
                            } catch (kf5 e3) {
                                objApply = ts0Var.f12086d.apply(e3);
                                return objApply;
                            }
                        } catch (FileNotFoundException unused3) {
                            C0310ra c0310ra = ts0Var.f12085c;
                            switch (c0310ra.f10610d) {
                                case 21:
                                    objApply = (byte[]) c0310ra.f10609a;
                                    break;
                                default:
                                    objApply = (zx2) c0310ra.f10609a;
                                    break;
                            }
                            return objApply;
                        }
                    } catch (IOException e4) {
                        objApply = ts0Var.f12086d.apply(new kf5(e4));
                        return objApply;
                    }
                }
                return objM2091a;
        }
    }
}
