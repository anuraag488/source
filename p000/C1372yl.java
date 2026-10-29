package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.C0079d3;
import ads_mobile_sdk.C0152hw;
import ads_mobile_sdk.C0176jd;
import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.C0367uz;
import ads_mobile_sdk.C0413y3;
import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.fy3;
import ads_mobile_sdk.ge2;
import ads_mobile_sdk.he2;
import ads_mobile_sdk.ia1;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.m11;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.n83;
import ads_mobile_sdk.p83;
import ads_mobile_sdk.pe2;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.q24;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.s83;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.vx3;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import ads_mobile_sdk.wc2;
import ads_mobile_sdk.xa3;
import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: yl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1372yl implements wy5, dr6 {

    /* JADX INFO: renamed from: a */
    public Object f35304a;

    /* JADX INFO: renamed from: b */
    public Object f35305b;

    /* JADX INFO: renamed from: c */
    public Object f35306c;

    /* JADX INFO: renamed from: d */
    public Object f35307d;

    /* JADX INFO: renamed from: e */
    public Object f35308e;

    /* JADX INFO: renamed from: f */
    public Object f35309f;

    /* JADX INFO: renamed from: g */
    public Object f35310g;

    /* JADX INFO: renamed from: h */
    public Object f35311h;

    /* JADX INFO: renamed from: c */
    public static C1372yl m13157c(Context context, q02 q02Var, String str, String str2, ArrayList arrayList, z32 z32Var) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strM9696d = q02Var.m9696d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Long.toString(packageInfo.getLongVersionCode());
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        C1372yl c1372yl = new C1372yl();
        c1372yl.f35304a = str;
        c1372yl.f35305b = str2;
        c1372yl.f35310g = arrayList;
        c1372yl.f35306c = strM9696d;
        c1372yl.f35307d = packageName;
        c1372yl.f35308e = string;
        c1372yl.f35309f = str3;
        c1372yl.f35311h = z32Var;
        VarHandle.storeStoreFence();
        return c1372yl;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6281. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: a */
    public java.lang.Object m13160a(android.net.Uri r21, ads_mobile_sdk.wc2 r22, int r23, long r24, java.lang.String r26, java.util.Map r27, ads_mobile_sdk.C0413y3 r28, ads_mobile_sdk.C0213l2 r29, java.lang.Boolean r30, p000.ym0 r31) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1372yl.m13160a(android.net.Uri, ads_mobile_sdk.wc2, int, long, java.lang.String, java.util.Map, ads_mobile_sdk.y3, ads_mobile_sdk.l2, java.lang.Boolean, ym0):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    @Override // p000.wy5
    /* JADX INFO: renamed from: b */
    public boolean mo12134b(String str, JSONObject jSONObject) {
        int i;
        Dialog dialog;
        bs5 bs5Var;
        al0 al0Var;
        ts5 ts5Var = (ts5) this.f35310g;
        byte b = 1;
        switch (str) {
            case "load_complete":
                ds5 ds5Var = (ds5) ts5Var.f31397j.getAndSet(null);
                if (ds5Var != null) {
                    if (!ts5Var.f31400m && !ts5Var.f31401n) {
                        fx5 fx5Var = ts5Var.f31393f;
                        fx5Var.m5845a((Queue) fx5Var.f19399g.get(), 4, 5, null);
                    }
                    ds5Var.mo3678e(ts5Var);
                    return true;
                }
            case "configure_app_assets":
                ju5 ju5Var = new ju5(b);
                ju5Var.f22636b = this;
                VarHandle.storeStoreFence();
                ((Executor) this.f35307d).execute(ju5Var);
                return true;
            case "browser":
                String strOptString = jSONObject.optString("url");
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
                }
                Uri uri = Uri.parse(strOptString);
                if (uri.getScheme() == null) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
                }
                try {
                    ((wu5) this.f35305b).startActivity(new Intent("android.intent.action.VIEW", uri));
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e);
                    return true;
                }
            case "dismiss":
                switch (jSONObject.optString("status")) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                    case "personalized":
                    case "CONSENT_SIGNAL_SUFFICIENT":
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                    case "non_personalized":
                        i = 3;
                        dialog = ts5Var.f31394g;
                        if (dialog != null) {
                            dialog.dismiss();
                            ts5Var.f31394g = null;
                        }
                        ts5Var.f31389b.f33746a = null;
                        bs5Var = (bs5) ts5Var.f31399l.getAndSet(null);
                        if (bs5Var != null) {
                            bs5Var.f15558b.f31388a.unregisterActivityLifecycleCallbacks(bs5Var);
                        }
                        al0Var = (al0) ts5Var.f31398k.getAndSet(null);
                        if (al0Var != null) {
                            ts5Var.f31390c.f25152b.edit().putInt("consent_status", i).commit();
                            al0Var.mo3042a(null);
                            return true;
                        }
                    case "CONSENT_SIGNAL_NOT_REQUIRED":
                        i = 1;
                        dialog = ts5Var.f31394g;
                        if (dialog != null) {
                            dialog.dismiss();
                            ts5Var.f31394g = null;
                        }
                        ts5Var.f31389b.f33746a = null;
                        bs5Var = (bs5) ts5Var.f31399l.getAndSet(null);
                        if (bs5Var != null) {
                            bs5Var.f15558b.f31388a.unregisterActivityLifecycleCallbacks(bs5Var);
                        }
                        al0Var = (al0) ts5Var.f31398k.getAndSet(null);
                        if (al0Var != null) {
                            ts5Var.f31390c.f25152b.edit().putInt("consent_status", i).commit();
                            al0Var.mo3042a(null);
                            return true;
                        }
                    default:
                        n56 n56Var = new n56(1, "We are getting something wrong with the webview.");
                        Dialog dialog2 = ts5Var.f31394g;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            ts5Var.f31394g = null;
                        }
                        ts5Var.f31389b.f33746a = null;
                        bs5 bs5Var2 = (bs5) ts5Var.f31399l.getAndSet(null);
                        if (bs5Var2 != null) {
                            bs5Var2.f15558b.f31388a.unregisterActivityLifecycleCallbacks(bs5Var2);
                        }
                        al0 al0Var2 = (al0) ts5Var.f31398k.getAndSet(null);
                        if (al0Var2 != null) {
                            ts5Var.m11132d(n56Var);
                            al0Var2.mo3042a(n56Var.m8537a());
                            return true;
                        }
                }
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public c44 m13166d(int i) {
        c44 c44Var = null;
        try {
            if (!d55.m4358c(2, i)) {
                JSONObject jSONObjectM3152v = ((ar3) this.f35308e).m3152v();
                if (jSONObjectM3152v != null) {
                    c44 c44VarM12237m = ((wd3) this.f35306c).m12237m(jSONObjectM3152v);
                    String str = "Loaded cached settings: " + jSONObjectM3152v.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    ((q50) this.f35307d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!d55.m4358c(3, i) && c44VarM12237m.f15798c < jCurrentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        }
                        return null;
                    }
                    try {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                        }
                        return c44VarM12237m;
                    } catch (Exception e) {
                        e = e;
                        c44Var = c44VarM12237m;
                        Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return c44Var;
                    }
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: e */
    public c44 m13167e() {
        return (c44) ((AtomicReference) this.f35310g).get();
    }

    @Override // p000.wy5
    /* JADX INFO: renamed from: f */
    public Executor mo12136f() {
        Handler handler = (Handler) this.f35306c;
        jo3 jo3Var = new jo3((byte) 1);
        jo3Var.f22472b = handler;
        VarHandle.storeStoreFence();
        return jo3Var;
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public wo5 mo4146j() {
        Application application = (Application) ((C1392z4) this.f35304a).f35744a;
        Handler handler = ky5.f23626a;
        g06.m5881a(handler);
        yq0 yq0Var = ky5.f23627b;
        g06.m5881a(yq0Var);
        mq5 mq5Var = (mq5) ((cr6) this.f35306c).mo4146j();
        gu5 gu5Var = (gu5) ((cr6) this.f35307d).mo4146j();
        yg3 yg3VarM13118p = ((yg3) this.f35308e).m13118p();
        r36 r36VarMo4146j = ((C1283w7) this.f35309f).mo4146j();
        c16 c16Var = (c16) ((cr6) this.f35310g).mo4146j();
        fx5 fx5Var = (fx5) ((cr6) this.f35311h).mo4146j();
        wo5 wo5Var = new wo5();
        wo5Var.f33566a = application;
        wo5Var.f33567b = handler;
        wo5Var.f33568c = yq0Var;
        wo5Var.f33569d = mq5Var;
        wo5Var.f33570e = gu5Var;
        wo5Var.f33571f = yg3VarM13118p;
        wo5Var.f33572g = r36VarMo4146j;
        wo5Var.f33573h = c16Var;
        wo5Var.f33574i = fx5Var;
        VarHandle.storeStoreFence();
        return wo5Var;
    }

    /* JADX INFO: renamed from: h */
    public void m13169h(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        wy5[] wy5VarArr = {this, (C1283w7) this.f35309f};
        c16 c16Var = (c16) this.f35308e;
        c16Var.getClass();
        yn3 yn3Var = new yn3((byte) 5);
        yn3Var.f35360b = queryParameter;
        yn3Var.f35361c = queryParameter2;
        yn3Var.f35362d = wy5VarArr;
        VarHandle.storeStoreFence();
        c16Var.f15758a.execute(yn3Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m13158a(C0413y3 c0413y3, String str, ym0 ym0Var) {
        n83 n83Var;
        if (ym0Var instanceof n83) {
            n83Var = (n83) ym0Var;
            int i = n83Var.f7591e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n83Var.f7591e = i - Integer.MIN_VALUE;
            } else {
                n83Var = new n83(this, ym0Var);
            }
        } else {
            n83Var = new n83(this, ym0Var);
        }
        Object obj = n83Var.f7589c;
        ap0 ap0Var = ap0.f14763a;
        int i2 = n83Var.f7591e;
        ju4 ju4Var = ju4.f22634a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = n83Var.f7588b;
                C1372yl c1372yl = n83Var.f7587a;
                k43.m7376J(obj);
                return ju4Var;
            }
            k43.m7376J(obj);
            if (str != null && str.length() != 0) {
                C0176jd c0176jdM3257p = as4.m3257p(zy5.m13855S(str).m3528l());
                C1023p6 c1023p6 = new C1023p6(c0176jdM3257p.f5701c, c0176jdM3257p.f5700b, c0176jdM3257p.f5702d);
                n83Var.f7587a = this;
                n83Var.f7588b = str;
                n83Var.f7591e = 1;
                if (!c0413y3.f13492f.getAndSet(true)) {
                    c0413y3.mo617a(c1023p6, n83Var);
                }
                return ju4Var == ap0Var ? ap0Var : ju4Var;
            }
            sy3.m2306a(new m11("AdEventValueString is null or empty"), false);
            return ju4Var;
        } catch (lb2 e) {
            sy3.m2306a(new m11(zi4.m13620t("Failed to parse ad event value from JSON: ", str)), false);
            ((vx3) this.f35311h).m2570a("Failed to parse ad event value from JSON: " + str, e);
            return ju4Var;
        } catch (Exception e2) {
            sy3.m2306a(new m11(zi4.m13620t("Failed while emitting ad paid event for ", str)), false);
            ((vx3) this.f35311h).m2570a("Failed while emitting ad paid event for " + str, e2);
            return ju4Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0199 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:91:0x017f, B:93:0x0186, B:95:0x018a, B:97:0x018e, B:100:0x0195, B:102:0x0199, B:104:0x019d, B:106:0x01a1, B:107:0x01a2, B:108:0x01a7, B:109:0x01a8, B:110:0x01af, B:111:0x01b0, B:112:0x01b7, B:113:0x01b8), top: B:118:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:104:0x019d A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:91:0x017f, B:93:0x0186, B:95:0x018a, B:97:0x018e, B:100:0x0195, B:102:0x0199, B:104:0x019d, B:106:0x01a1, B:107:0x01a2, B:108:0x01a7, B:109:0x01a8, B:110:0x01af, B:111:0x01b0, B:112:0x01b7, B:113:0x01b8), top: B:118:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a1 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:91:0x017f, B:93:0x0186, B:95:0x018a, B:97:0x018e, B:100:0x0195, B:102:0x0199, B:104:0x019d, B:106:0x01a1, B:107:0x01a2, B:108:0x01a7, B:109:0x01a8, B:110:0x01af, B:111:0x01b0, B:112:0x01b7, B:113:0x01b8), top: B:118:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a2 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:91:0x017f, B:93:0x0186, B:95:0x018a, B:97:0x018e, B:100:0x0195, B:102:0x0199, B:104:0x019d, B:106:0x01a1, B:107:0x01a2, B:108:0x01a7, B:109:0x01a8, B:110:0x01af, B:111:0x01b0, B:112:0x01b7, B:113:0x01b8), top: B:118:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a8 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:91:0x017f, B:93:0x0186, B:95:0x018a, B:97:0x018e, B:100:0x0195, B:102:0x0199, B:104:0x019d, B:106:0x01a1, B:107:0x01a2, B:108:0x01a7, B:109:0x01a8, B:110:0x01af, B:111:0x01b0, B:112:0x01b7, B:113:0x01b8), top: B:118:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:91:0x017f, B:93:0x0186, B:95:0x018a, B:97:0x018e, B:100:0x0195, B:102:0x0199, B:104:0x019d, B:106:0x01a1, B:107:0x01a2, B:108:0x01a7, B:109:0x01a8, B:110:0x01af, B:111:0x01b0, B:112:0x01b7, B:113:0x01b8), top: B:118:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b8 A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #0 {all -> 0x0192, blocks: (B:91:0x017f, B:93:0x0186, B:95:0x018a, B:97:0x018e, B:100:0x0195, B:102:0x0199, B:104:0x019d, B:106:0x01a1, B:107:0x01a2, B:108:0x01a7, B:109:0x01a8, B:110:0x01af, B:111:0x01b0, B:112:0x01b7, B:113:0x01b8), top: B:118:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0 A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e4, B:51:0x00e8, B:54:0x00ef, B:56:0x00f3, B:58:0x00f7, B:60:0x00fb, B:61:0x00fc, B:62:0x0101, B:63:0x0102, B:64:0x0109, B:65:0x010a, B:66:0x0111, B:67:0x0112), top: B:126:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3 A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e4, B:51:0x00e8, B:54:0x00ef, B:56:0x00f3, B:58:0x00f7, B:60:0x00fb, B:61:0x00fc, B:62:0x0101, B:63:0x0102, B:64:0x0109, B:65:0x010a, B:66:0x0111, B:67:0x0112), top: B:126:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7 A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e4, B:51:0x00e8, B:54:0x00ef, B:56:0x00f3, B:58:0x00f7, B:60:0x00fb, B:61:0x00fc, B:62:0x0101, B:63:0x0102, B:64:0x0109, B:65:0x010a, B:66:0x0111, B:67:0x0112), top: B:126:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e4, B:51:0x00e8, B:54:0x00ef, B:56:0x00f3, B:58:0x00f7, B:60:0x00fb, B:61:0x00fc, B:62:0x0101, B:63:0x0102, B:64:0x0109, B:65:0x010a, B:66:0x0111, B:67:0x0112), top: B:126:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e4, B:51:0x00e8, B:54:0x00ef, B:56:0x00f3, B:58:0x00f7, B:60:0x00fb, B:61:0x00fc, B:62:0x0101, B:63:0x0102, B:64:0x0109, B:65:0x010a, B:66:0x0111, B:67:0x0112), top: B:126:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0102 A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e4, B:51:0x00e8, B:54:0x00ef, B:56:0x00f3, B:58:0x00f7, B:60:0x00fb, B:61:0x00fc, B:62:0x0101, B:63:0x0102, B:64:0x0109, B:65:0x010a, B:66:0x0111, B:67:0x0112), top: B:126:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x010a A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e4, B:51:0x00e8, B:54:0x00ef, B:56:0x00f3, B:58:0x00f7, B:60:0x00fb, B:61:0x00fc, B:62:0x0101, B:63:0x0102, B:64:0x0109, B:65:0x010a, B:66:0x0111, B:67:0x0112), top: B:126:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0112 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #5 {all -> 0x00ec, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e4, B:51:0x00e8, B:54:0x00ef, B:56:0x00f3, B:58:0x00f7, B:60:0x00fb, B:61:0x00fc, B:62:0x0101, B:63:0x0102, B:64:0x0109, B:65:0x010a, B:66:0x0111, B:67:0x0112), top: B:126:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0186 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:91:0x017f, B:93:0x0186, B:95:0x018a, B:97:0x018e, B:100:0x0195, B:102:0x0199, B:104:0x019d, B:106:0x01a1, B:107:0x01a2, B:108:0x01a7, B:109:0x01a8, B:110:0x01af, B:111:0x01b0, B:112:0x01b7, B:113:0x01b8), top: B:118:0x017f }] */
    /* JADX INFO: renamed from: a */
    public Object m13159a(Uri uri, q11 q11Var, C0413y3 c0413y3, ym0 ym0Var) {
        p83 p83Var;
        mx3 mx3VarM655a;
        mx3 mx3Var;
        q11 q11Var2;
        mx3 mx3Var2;
        mx3 mx3VarM2635a;
        mx3 mx3Var3;
        q11 q11Var3;
        mx3 mx3Var4;
        ju4 ju4Var = ju4.f22634a;
        if (ym0Var instanceof p83) {
            p83Var = (p83) ym0Var;
            int i = p83Var.f8510f;
            if ((i & Integer.MIN_VALUE) != 0) {
                p83Var.f8510f = i - Integer.MIN_VALUE;
            } else {
                p83Var = new p83(this, ym0Var);
            }
        } else {
            p83Var = new p83(this, ym0Var);
        }
        Object obj = p83Var.f8508d;
        Object obj2 = ap0.f14763a;
        int i2 = p83Var.f8510f;
        if (i2 != 0) {
            if (i2 == 1) {
                mx3Var3 = p83Var.f8507c;
                mx3Var4 = p83Var.f8506b;
                q11Var3 = p83Var.f8505a;
                try {
                    k43.m7376J(obj);
                    ((ia1) q11Var3.f8791b).getClass();
                    mx3VarM2635a = mx3Var3;
                    lb5.m7941v(mx3VarM2635a, null);
                    return ju4Var;
                } catch (Throwable th) {
                    th = th;
                    mx3VarM2635a = mx3Var4;
                    try {
                        mx3VarM2635a.m1736b(th);
                        if (!(th instanceof ka5)) {
                            if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                mx3VarM2635a.m1735a(th);
                            }
                            if (!(th instanceof zm4)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof w11) {
                                        throw th;
                                    }
                                    throw new b11(th);
                                }
                                throw new w01(th);
                            }
                            throw new j31(th);
                        }
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            lb5.m7941v(mx3Var3, th2);
                            throw th3;
                        }
                    }
                }
            }
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mx3Var = p83Var.f8507c;
            mx3Var2 = p83Var.f8506b;
            q11Var2 = p83Var.f8505a;
            try {
                k43.m7376J(obj);
                ((ia1) q11Var2.f8791b).getClass();
                mx3VarM655a = mx3Var;
                lb5.m7941v(mx3VarM655a, null);
                return ju4Var;
            } catch (Throwable th4) {
                th = th4;
                mx3VarM655a = mx3Var2;
                try {
                    mx3VarM655a.m1736b(th);
                    if (!(th instanceof ka5)) {
                        if (!(th instanceof zm4)) {
                            mx3VarM655a.m1735a(th);
                        }
                        if (!(th instanceof zm4)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof w11) {
                                    throw th;
                                }
                                throw new b11(th);
                            }
                            throw new w01(th);
                        }
                        throw new j31(th);
                    }
                    throw th;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        lb5.m7941v(mx3Var, th5);
                        throw th6;
                    }
                }
            }
        }
        k43.m7376J(obj);
        xa3 xa3Var = (xa3) this.f35310g;
        s21 s21Var = s21.f11024I0;
        v71 v71Var = v71.f32439a;
        fy3 fy3VarM4712n = dt0.m4712n();
        if (cy3.m656b().f1710a == null) {
            mx3VarM2635a = xa3.m2635a(xa3Var, s21Var, v71Var, fy3VarM4712n);
            try {
                if (!m13165a(uri)) {
                    sy3.m2306a(new m11("Untrusted domain for ad event value: " + uri), false);
                    ((ia1) q11Var.f8791b).getClass();
                } else {
                    String str = (String) ((ia1) q11Var.f8791b).f4913c.get("X-Afma-Ad-Event-Value");
                    if (str == null) {
                        str = (String) ((ia1) q11Var.f8791b).f4913c.get("X-Ad-Event-Value");
                    }
                    p83Var.f8505a = q11Var;
                    p83Var.f8506b = mx3VarM2635a;
                    p83Var.f8507c = mx3VarM2635a;
                    p83Var.f8510f = 1;
                    if (m13158a(c0413y3, str, p83Var) != obj2) {
                        q11Var3 = q11Var;
                        mx3Var3 = mx3VarM2635a;
                        mx3Var4 = mx3Var3;
                        ((ia1) q11Var3.f8791b).getClass();
                        mx3VarM2635a = mx3Var3;
                    }
                }
                lb5.m7941v(mx3VarM2635a, null);
                return ju4Var;
            } catch (Throwable th7) {
                th = th7;
                mx3Var3 = mx3VarM2635a;
                mx3VarM2635a.m1736b(th);
                if (!(th instanceof ka5)) {
                    if (!(th instanceof zm4)) {
                        mx3VarM2635a.m1735a(th);
                    }
                    if (!(th instanceof zm4)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof w11) {
                                throw th;
                            }
                            throw new b11(th);
                        }
                        throw new w01(th);
                    }
                    throw new j31(th);
                }
                throw th;
            }
        }
        mx3VarM655a = cy3.m655a(s21Var, v71Var, true);
        try {
            if (!m13165a(uri)) {
                sy3.m2306a(new m11("Untrusted domain for ad event value: " + uri), false);
                ((ia1) q11Var.f8791b).getClass();
            } else {
                String str2 = (String) ((ia1) q11Var.f8791b).f4913c.get("X-Afma-Ad-Event-Value");
                if (str2 == null) {
                    str2 = (String) ((ia1) q11Var.f8791b).f4913c.get("X-Ad-Event-Value");
                }
                p83Var.f8505a = q11Var;
                p83Var.f8506b = mx3VarM655a;
                p83Var.f8507c = mx3VarM655a;
                p83Var.f8510f = 2;
                if (m13158a(c0413y3, str2, p83Var) != obj2) {
                    q11Var2 = q11Var;
                    mx3Var = mx3VarM655a;
                    mx3Var2 = mx3Var;
                    ((ia1) q11Var2.f8791b).getClass();
                    mx3VarM655a = mx3Var;
                }
            }
            lb5.m7941v(mx3VarM655a, null);
            return ju4Var;
        } catch (Throwable th8) {
            th = th8;
            mx3Var = mx3VarM655a;
            mx3VarM655a.m1736b(th);
            if (!(th instanceof ka5)) {
                if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                    mx3VarM655a.m1735a(th);
                }
                if (!(th instanceof zm4)) {
                    if (!(th instanceof CancellationException)) {
                        if (th instanceof w11) {
                            throw th;
                        }
                        throw new b11(th);
                    }
                    throw new w01(th);
                }
                throw new j31(th);
            }
            throw th;
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m13165a(Uri uri) {
        ey0 ey0Var = (ey0) this.f35304a;
        if (!((Boolean) ey0Var.m13553a("gads:ad_event_value:validate_domain:enabled", Boolean.FALSE, C0033as.a$19)).booleanValue()) {
            return true;
        }
        String host = uri.getHost();
        if (host != null) {
            List list = (List) ey0Var.m13553a("gads:ad_event_value:trusted_domains", kx5.m7694Y("doubleclick.net", "google.com", "googleadservices.com"), C0033as.a$2);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String strM6349o0 = hd4.m6349o0((String) it.next(), ".");
                    if (host.equals(strM6349o0) || od4.m9038S(host, ".".concat(strM6349o0), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public String m13161a(Uri uri, int i) {
        if (((Boolean) ((ey0) this.f35304a).m13553a("gads:include_ping_attempts:enabled", Boolean.TRUE, C0033as.a$19)).booleanValue()) {
            String encodedQuery = uri.getEncodedQuery();
            return uri.buildUpon().clearQuery().appendQueryParameter("pa", String.valueOf(i)).build() + "&" + encodedQuery;
        }
        return uri.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m13162a(Uri uri, C0213l2 c0213l2, C0367uz c0367uz, C0413y3 c0413y3, Boolean bool) {
        zo0 zo0Var = (zo0) this.f35306c;
        ey0 ey0Var = (ey0) this.f35304a;
        Boolean bool2 = Boolean.TRUE;
        C0033as c0033as = C0033as.a$19;
        wm0 wm0Var = null;
        if (((Boolean) ey0Var.m13553a("gads:use_retry_strategy:enabled", bool2, c0033as)).booleanValue() && c0213l2.f6657x0 != null) {
            lb5.m7910S(zo0Var, null, null, new C0934n5(this, uri, c0213l2, c0367uz, c0413y3, bool, null, (byte) 7), 3);
            return;
        }
        if (c0413y3 != null && z62.m13387o(bool, bool2) && ((Boolean) ey0Var.m13553a("gads:ad_events_for_scar:enabled", bool2, c0033as)).booleanValue() && c0213l2.f6578B0) {
            lb5.m7910S(zo0Var, null, null, new C1199ty(this, uri, c0413y3, wm0Var, (byte) 20), 3);
            return;
        }
        ((q24) this.f35308e).f8836e.mo5493n(new l73(uri, ((C0152hw) this.f35309f).m1189a(uri)));
    }

    /* JADX INFO: renamed from: a */
    public static void m13156a(C1372yl c1372yl, List list, C0213l2 c0213l2, C0367uz c0367uz, C0413y3 c0413y3, Boolean bool, int i) {
        if ((i & 8) != 0) {
            c0413y3 = null;
        }
        C0413y3 c0413y4 = c0413y3;
        if ((i & 16) != 0) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = bool;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1372yl.m13162a((Uri) it.next(), c0213l2, c0367uz, c0413y4, bool2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13164a(List list) {
        q24 q24Var = (q24) this.f35308e;
        ArrayList arrayList = new ArrayList(ib0.m6717y0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            arrayList.add(new l73(uri, ((C0152hw) this.f35309f).m1189a(uri)));
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l73 l73Var = (l73) obj;
            q24Var.f8836e.mo5493n(new l73((Uri) l73Var.f23833a, (Map) l73Var.f23834b));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13163a(Uri uri, wc2 wc2Var, int i, long j, String str, Map map, C0413y3 c0413y3, C0213l2 c0213l2, Boolean bool) {
        wm0 wm0Var = null;
        if (i >= wc2Var.f12959a) {
            if (wc2Var.f12961c) {
                pe2 pe2Var = (pe2) this.f35305b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String strM13161a = m13161a(uri, i + 1);
                ge2 ge2Var = ge2.f3922a;
                he2 he2Var = new he2();
                he2Var.f4385a = jElapsedRealtime;
                he2Var.f4386b = str;
                he2Var.f4387c = strM13161a;
                VarHandle.storeStoreFence();
                lb5.m7910S(pe2Var.f8558a, null, null, new C1160sw(pe2Var, new C0079d3((Object) pe2Var, (Object) he2Var, wm0Var, (byte) 14), (wm0) null), 3);
                return;
            }
            return;
        }
        lb5.m7910S((zo0) this.f35306c, null, null, new s83(i, j, uri, c0213l2, c0413y3, wc2Var, this, bool, str, map, null), 3);
    }
}
