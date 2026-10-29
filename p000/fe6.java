package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fe6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18931a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18932b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18933c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f18934d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f18935e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f18936f;

    public /* synthetic */ fe6(byte b) {
        this.f18931a = b;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0106 A[Catch: RuntimeException -> 0x00e4, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:66:0x014f, B:69:0x0168, B:71:0x0177, B:70:0x016f, B:72:0x018a, B:74:0x0190, B:76:0x0196, B:78:0x019c, B:80:0x01a2, B:82:0x01aa, B:84:0x01b2, B:86:0x01b8, B:87:0x01ca, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:95:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0111 A[Catch: RuntimeException -> 0x00e4, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:66:0x014f, B:69:0x0168, B:71:0x0177, B:70:0x016f, B:72:0x018a, B:74:0x0190, B:76:0x0196, B:78:0x019c, B:80:0x01a2, B:82:0x01aa, B:84:0x01b2, B:86:0x01b8, B:87:0x01ca, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:95:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f A[Catch: RuntimeException -> 0x00e4, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:66:0x014f, B:69:0x0168, B:71:0x0177, B:70:0x016f, B:72:0x018a, B:74:0x0190, B:76:0x0196, B:78:0x019c, B:80:0x01a2, B:82:0x01aa, B:84:0x01b2, B:86:0x01b8, B:87:0x01ca, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:95:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0168 A[Catch: RuntimeException -> 0x00e4, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:66:0x014f, B:69:0x0168, B:71:0x0177, B:70:0x016f, B:72:0x018a, B:74:0x0190, B:76:0x0196, B:78:0x019c, B:80:0x01a2, B:82:0x01aa, B:84:0x01b2, B:86:0x01b8, B:87:0x01ca, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:95:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x016f A[Catch: RuntimeException -> 0x00e4, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:66:0x014f, B:69:0x0168, B:71:0x0177, B:70:0x016f, B:72:0x018a, B:74:0x0190, B:76:0x0196, B:78:0x019c, B:80:0x01a2, B:82:0x01aa, B:84:0x01b2, B:86:0x01b8, B:87:0x01ca, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:95:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018a A[Catch: RuntimeException -> 0x00e4, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:66:0x014f, B:69:0x0168, B:71:0x0177, B:70:0x016f, B:72:0x018a, B:74:0x0190, B:76:0x0196, B:78:0x019c, B:80:0x01a2, B:82:0x01aa, B:84:0x01b2, B:86:0x01b8, B:87:0x01ca, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:95:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0190 A[Catch: RuntimeException -> 0x00e4, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:66:0x014f, B:69:0x0168, B:71:0x0177, B:70:0x016f, B:72:0x018a, B:74:0x0190, B:76:0x0196, B:78:0x019c, B:80:0x01a2, B:82:0x01aa, B:84:0x01b2, B:86:0x01b8, B:87:0x01ca, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:95:0x0072 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        d76 d76Var;
        Bundle bundleM4616u0;
        String str;
        d76 d76Var2;
        x66 x66Var;
        Bundle bundleM4616u1;
        byte b = 0;
        switch (this.f18931a) {
            case 0:
                oj6 oj6VarM9027n = ((AppMeasurementDynamiteService) this.f18936f).f16259a.m9027n();
                qx5 qx5Var = (qx5) this.f18935e;
                String str2 = (String) this.f18932b;
                String str3 = (String) this.f18933c;
                boolean z = this.f18934d;
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                cp6 cp6VarM9142L = oj6VarM9027n.m9142L(false);
                vh6 vh6Var = new vh6(b);
                vh6Var.f32627b = str2;
                vh6Var.f32628c = str3;
                vh6Var.f32629d = cp6VarM9142L;
                vh6Var.f32630e = z;
                vh6Var.f32632g = qx5Var;
                vh6Var.f32631f = oj6VarM9027n;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(vh6Var);
                break;
            case 1:
                String str4 = (String) this.f18932b;
                String str5 = (String) this.f18933c;
                boolean z2 = this.f18934d;
                oj6 oj6VarM9027n2 = ((oa6) ((mg6) this.f18936f).f36084a).m9027n();
                AtomicReference atomicReference = (AtomicReference) this.f18935e;
                oj6VarM9027n2.mo5038t();
                oj6VarM9027n2.m9741u();
                cp6 cp6VarM9142L2 = oj6VarM9027n2.m9142L(false);
                vh6 vh6Var2 = new vh6((byte) 1);
                vh6Var2.f32632g = atomicReference;
                vh6Var2.f32627b = str4;
                vh6Var2.f32628c = str5;
                vh6Var2.f32629d = cp6VarM9142L2;
                vh6Var2.f32630e = z2;
                vh6Var2.f32631f = oj6VarM9027n2;
                VarHandle.storeStoreFence();
                oj6VarM9027n2.m9140J(vh6Var2);
                break;
            case 2:
                mg6 mg6Var = (mg6) ((zs5) this.f18936f).f36348b;
                oa6 oa6Var = (oa6) mg6Var.f36084a;
                mg6Var.mo5038t();
                y86 y86Var = mg6Var.f24892P;
                String str6 = (String) this.f18933c;
                Uri uri = (Uri) this.f18935e;
                try {
                    dn6 dn6Var = oa6Var.f26517i;
                    d76 d76Var3 = oa6Var.f26514f;
                    oa6.m9014j(dn6Var);
                    String str7 = "Activity created with data 'referrer' without required params";
                    if (!TextUtils.isEmpty(str6)) {
                        if (!str6.contains("gclid")) {
                            d76Var = d76Var3;
                            if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                d76 d76Var4 = ((oa6) dn6Var.f36084a).f26514f;
                                oa6.m9016l(d76Var4);
                                d76Var4.f16842q.m12504a("Activity created with data 'referrer' without required params");
                            }
                            str = (String) this.f18932b;
                            if (this.f18934d) {
                                dn6 dn6Var2 = oa6Var.f26517i;
                                oa6.m9014j(dn6Var2);
                                bundleM4616u1 = dn6Var2.m4616u0(uri);
                                if (bundleM4616u1 != null) {
                                    bundleM4616u1.putString("_cis", "intent");
                                    if (bundleM4616u1.containsKey("gclid") && bundleM4616u0 != null && bundleM4616u0.containsKey("gclid")) {
                                        bundleM4616u1.putString("_cer", "gclid=" + bundleM4616u0.getString("gclid"));
                                    }
                                    mg6Var.m8301B(str, "_cmp", bundleM4616u1);
                                    y86Var.m13050b(str, bundleM4616u1);
                                } else {
                                    str7 = "Activity created with data 'referrer' without required params";
                                }
                            } else {
                                str7 = "Activity created with data 'referrer' without required params";
                            }
                            if (!TextUtils.isEmpty(str6)) {
                                oa6.m9016l(d76Var);
                                d76Var2 = d76Var;
                                x66Var = d76Var2.f16842q;
                                x66Var.m12505b(str6, "Activity created with referrer");
                                if (oa6Var.f26512d.m9225E(null, e56.f17730G0)) {
                                    if (bundleM4616u0 != null) {
                                        mg6Var.m8301B(str, "_cmp", bundleM4616u0);
                                        y86Var.m13050b(str, bundleM4616u0);
                                    } else {
                                        oa6.m9016l(d76Var2);
                                        x66Var.m12505b(str6, "Referrer does not contain valid parameters");
                                    }
                                    oa6Var.f26519k.getClass();
                                    mg6Var.m8304E("auto", "_ldl", null, true, System.currentTimeMillis());
                                } else if (str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                    oa6.m9016l(d76Var2);
                                    x66Var.m12504a(str7);
                                } else if (!TextUtils.isEmpty(str6)) {
                                    oa6Var.f26519k.getClass();
                                    mg6Var.m8304E("auto", "_ldl", str6, true, System.currentTimeMillis());
                                }
                            }
                        } else {
                            d76Var = d76Var3;
                        }
                        bundleM4616u0 = dn6Var.m4616u0(Uri.parse("https://google.com/search?".concat(str6)));
                        if (bundleM4616u0 != null) {
                            bundleM4616u0.putString("_cis", "referrer");
                        }
                        str = (String) this.f18932b;
                        if (this.f18934d) {
                            dn6 dn6Var3 = oa6Var.f26517i;
                            oa6.m9014j(dn6Var3);
                            bundleM4616u1 = dn6Var3.m4616u0(uri);
                            if (bundleM4616u1 != null) {
                                bundleM4616u1.putString("_cis", "intent");
                                if (bundleM4616u1.containsKey("gclid")) {
                                }
                                mg6Var.m8301B(str, "_cmp", bundleM4616u1);
                                y86Var.m13050b(str, bundleM4616u1);
                            } else {
                                str7 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str7 = "Activity created with data 'referrer' without required params";
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            oa6.m9016l(d76Var);
                            d76Var2 = d76Var;
                            x66Var = d76Var2.f16842q;
                            x66Var.m12505b(str6, "Activity created with referrer");
                            if (oa6Var.f26512d.m9225E(null, e56.f17730G0)) {
                                if (str6.contains("gclid")) {
                                }
                                oa6.m9016l(d76Var2);
                                x66Var.m12504a(str7);
                            } else {
                                if (bundleM4616u0 != null) {
                                    mg6Var.m8301B(str, "_cmp", bundleM4616u0);
                                    y86Var.m13050b(str, bundleM4616u0);
                                } else {
                                    oa6.m9016l(d76Var2);
                                    x66Var.m12505b(str6, "Referrer does not contain valid parameters");
                                }
                                oa6Var.f26519k.getClass();
                                mg6Var.m8304E("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } else {
                        d76Var = d76Var3;
                    }
                    bundleM4616u0 = null;
                    str = (String) this.f18932b;
                    if (this.f18934d) {
                        dn6 dn6Var4 = oa6Var.f26517i;
                        oa6.m9014j(dn6Var4);
                        bundleM4616u1 = dn6Var4.m4616u0(uri);
                        if (bundleM4616u1 != null) {
                            bundleM4616u1.putString("_cis", "intent");
                            if (bundleM4616u1.containsKey("gclid")) {
                            }
                            mg6Var.m8301B(str, "_cmp", bundleM4616u1);
                            y86Var.m13050b(str, bundleM4616u1);
                        } else {
                            str7 = "Activity created with data 'referrer' without required params";
                        }
                    } else {
                        str7 = "Activity created with data 'referrer' without required params";
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        oa6.m9016l(d76Var);
                        d76Var2 = d76Var;
                        x66Var = d76Var2.f16842q;
                        x66Var.m12505b(str6, "Activity created with referrer");
                        if (oa6Var.f26512d.m9225E(null, e56.f17730G0)) {
                            if (str6.contains("gclid")) {
                            }
                            oa6.m9016l(d76Var2);
                            x66Var.m12504a(str7);
                        } else {
                            if (bundleM4616u0 != null) {
                                mg6Var.m8301B(str, "_cmp", bundleM4616u0);
                                y86Var.m13050b(str, bundleM4616u0);
                            } else {
                                oa6.m9016l(d76Var2);
                                x66Var.m12505b(str6, "Referrer does not contain valid parameters");
                            }
                            oa6Var.f26519k.getClass();
                            mg6Var.m8304E("auto", "_ldl", null, true, System.currentTimeMillis());
                        }
                    }
                } catch (RuntimeException e) {
                    d76 d76Var5 = ((oa6) mg6Var.f36084a).f26514f;
                    oa6.m9016l(d76Var5);
                    d76Var5.f16835j.m12505b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                oj6 oj6Var = (oj6) this.f18936f;
                s56 s56Var = oj6Var.f26789h;
                oa6 oa6Var2 = (oa6) oj6Var.f36084a;
                if (s56Var == null) {
                    d76 d76Var6 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var6);
                    d76Var6.f16835j.m12504a("Failed to send default event parameters to service");
                } else {
                    boolean zM9225E = oa6Var2.f26512d.m9225E(null, e56.f17777c1);
                    cp6 cp6Var = (cp6) this.f18935e;
                    if (zM9225E) {
                        oj6Var.m9145O(s56Var, this.f18934d ? null : (os5) this.f18932b, cp6Var);
                    } else {
                        try {
                            s56Var.mo5568e((Bundle) this.f18933c, cp6Var);
                            oj6Var.m9139I();
                        } catch (RemoteException e2) {
                            d76 d76Var7 = oa6Var2.f26514f;
                            oa6.m9016l(d76Var7);
                            d76Var7.f16835j.m12505b(e2, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }
}
