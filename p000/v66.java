package p000;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v66 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32431a = 0;

    /* JADX INFO: renamed from: b */
    public int f32432b;

    /* JADX INFO: renamed from: c */
    public String f32433c;

    /* JADX INFO: renamed from: d */
    public Object f32434d;

    /* JADX INFO: renamed from: e */
    public Object f32435e;

    /* JADX INFO: renamed from: f */
    public Object f32436f;

    /* JADX INFO: renamed from: g */
    public Object f32437g;

    public /* synthetic */ v66(String str, k76 k76Var, int i, IOException iOException, byte[] bArr, Map map) {
        this.f32434d = k76Var;
        this.f32432b = i;
        this.f32435e = iOException;
        this.f32436f = bArr;
        this.f32433c = str;
        this.f32437g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32431a) {
            case 0:
                d76 d76Var = (d76) this.f32437g;
                s86 s86Var = ((oa6) d76Var.f36084a).f26513e;
                oa6.m9014j(s86Var);
                if (!s86Var.f23955f) {
                    Log.println(6, d76Var.m4402A(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (d76Var.f16832g == 0) {
                    op5 op5Var = ((oa6) d76Var.f36084a).f26512d;
                    if (op5Var.f26945i == null) {
                        synchronized (op5Var) {
                            try {
                                if (op5Var.f26945i == null) {
                                    oa6 oa6Var = (oa6) op5Var.f36084a;
                                    ApplicationInfo applicationInfo = oa6Var.f26509a.getApplicationInfo();
                                    String strM5551v = C0638f5.m5551v();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        op5Var.f26945i = Boolean.valueOf(str != null && str.equals(strM5551v));
                                    }
                                    if (op5Var.f26945i == null) {
                                        op5Var.f26945i = Boolean.TRUE;
                                        d76 d76Var2 = oa6Var.f26514f;
                                        oa6.m9016l(d76Var2);
                                        d76Var2.f16835j.m12504a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (op5Var.f26945i.booleanValue()) {
                        d76Var.f16832g = 'C';
                    } else {
                        d76Var.f16832g = 'c';
                    }
                    break;
                }
                long j = d76Var.f16833h;
                if (j < 0) {
                    ((oa6) d76Var.f36084a).f26512d.m9235z();
                    j = 130000;
                    d76Var.f16833h = 130000L;
                }
                int i = this.f32432b;
                char c = d76Var.f16832g;
                String str2 = this.f32433c;
                Object obj = this.f32434d;
                Object obj2 = this.f32435e;
                Object obj3 = this.f32436f;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strM4399B = d76.m4399B(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(sk5.m10848n(String.valueOf(cCharAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + strM4399B.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strM4399B);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                p86 p86Var = s86Var.f29987i;
                if (p86Var != null) {
                    String str3 = (String) p86Var.f27461d;
                    s86 s86Var2 = (s86) p86Var.f27462e;
                    s86Var2.mo5038t();
                    if (((s86) p86Var.f27462e).m10560y().getLong((String) p86Var.f27459b, 0L) == 0) {
                        p86Var.m9438b();
                    }
                    SharedPreferences sharedPreferencesM10560y = s86Var2.m10560y();
                    String str4 = (String) p86Var.f27460c;
                    long j2 = sharedPreferencesM10560y.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = s86Var2.m10560y().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    dn6 dn6Var = ((oa6) s86Var2.f36084a).f26517i;
                    oa6.m9014j(dn6Var);
                    long jNextLong = dn6Var.m4614s0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = s86Var2.m10560y().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((k76) this.f32434d).mo7423e(this.f32433c, this.f32432b, (Throwable) this.f32435e, (byte[]) this.f32436f, (Map) this.f32437g);
                return;
        }
    }

    public /* synthetic */ v66() {
    }
}
