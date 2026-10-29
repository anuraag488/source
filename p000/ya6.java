package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ya6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35074a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f35075b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f35076c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ long f35077d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f35078e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f35079f;

    public /* synthetic */ ya6(byte b) {
        this.f35074a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35074a) {
            case 0:
                String str = (String) this.f35076c;
                qm6 qm6Var = ((jc6) this.f35079f).f22167a;
                String str2 = (String) this.f35075b;
                if (str2 != null) {
                    eh6 eh6Var = new eh6((String) this.f35078e, str2, this.f35077d);
                    qm6Var.mo9020c().mo5038t();
                    String str3 = qm6Var.f28587G;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    qm6Var.f28587G = str;
                    qm6Var.f28586F = eh6Var;
                } else {
                    qm6Var.mo9020c().mo5038t();
                    String str4 = qm6Var.f28587G;
                    if (str4 == null || str4.equals(str)) {
                        qm6Var.f28587G = str;
                        qm6Var.f28586F = null;
                    }
                }
                break;
            case 1:
                mg6 mg6Var = (mg6) this.f35079f;
                String str5 = (String) this.f35075b;
                String str6 = (String) this.f35076c;
                mg6Var.m8306G(this.f35077d, this.f35078e, str5, str6);
                break;
            default:
                uh6 uh6Var = (uh6) this.f35079f;
                Bundle bundle = (Bundle) this.f35075b;
                eh6 eh6Var2 = (eh6) this.f35076c;
                eh6 eh6Var3 = (eh6) this.f35078e;
                long j = this.f35077d;
                uh6Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                dn6 dn6Var = ((oa6) uh6Var.f36084a).f26517i;
                oa6.m9014j(dn6Var);
                uh6Var.m11557E(eh6Var2, eh6Var3, j, true, dn6Var.m4582C("screen_view", bundle, null, false));
                break;
        }
    }
}
