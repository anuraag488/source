package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23965a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mg6 f23966b;

    public /* synthetic */ ld6(byte b) {
        this.f23965a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23965a) {
            case 0:
                this.f23966b.m8317R();
                break;
            case 1:
                y86 y86Var = this.f23966b.f24892P;
                oa6 oa6Var = y86Var.f35029b;
                ea6 ea6Var = oa6Var.f26515g;
                mg6 mg6Var = oa6Var.f26521m;
                s86 s86Var = oa6Var.f26513e;
                oa6.m9016l(ea6Var);
                ea6Var.mo5038t();
                if (y86Var.m13052d()) {
                    if (y86Var.m13051c()) {
                        oa6.m9014j(s86Var);
                        s86Var.f29982U.m10507d(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        oa6.m9015k(mg6Var);
                        mg6Var.m8301B("auto", "_cmpx", bundle);
                    } else {
                        oa6.m9014j(s86Var);
                        C1126rz c1126rz = s86Var.f29982U;
                        String strM10506c = c1126rz.m10506c();
                        if (TextUtils.isEmpty(strM10506c)) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16836k.m12504a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jM8623a = s86Var.f29983V.m8623a() / 3600000;
                            Uri uri = Uri.parse(strM10506c);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jM8623a - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            oa6.m9015k(mg6Var);
                            mg6Var.m8301B(str2, "_cmp", (Bundle) pair.second);
                        }
                        c1126rz.m10507d(null);
                    }
                    oa6.m9014j(s86Var);
                    s86Var.f29983V.m8624b(0L);
                    break;
                }
                break;
            case 2:
                mg6 mg6Var2 = this.f23966b;
                mg6Var2.mo5038t();
                oa6 oa6Var2 = (oa6) mg6Var2.f36084a;
                s86 s86Var2 = oa6Var2.f26513e;
                d76 d76Var2 = oa6Var2.f26514f;
                oa6.m9014j(s86Var2);
                h86 h86Var = s86Var2.f29979R;
                if (h86Var.m6280a()) {
                    oa6.m9016l(d76Var2);
                    d76Var2.f16842q.m12504a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    n86 n86Var = s86Var2.f29980S;
                    long jM8623a2 = n86Var.m8623a();
                    n86Var.m8624b(1 + jM8623a2);
                    if (jM8623a2 >= 5) {
                        oa6.m9016l(d76Var2);
                        d76Var2.f16838m.m12504a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        h86Var.m6281b(true);
                    } else {
                        nd6 nd6Var = mg6Var2.f24894R;
                        if (nd6Var == null) {
                            nd6Var = new nd6(mg6Var2, oa6Var2, (byte) 3, false);
                            mg6Var2.f24894R = nd6Var;
                        }
                        nd6Var.m6923b(0L);
                    }
                }
                break;
            default:
                this.f23966b.m8317R();
                break;
        }
    }
}
