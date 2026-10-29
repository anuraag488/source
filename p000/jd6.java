package p000;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jd6 {

    /* JADX INFO: renamed from: a */
    public final Context f22185a;

    /* JADX INFO: renamed from: b */
    public final Boolean f22186b;

    /* JADX INFO: renamed from: c */
    public final long f22187c;

    /* JADX INFO: renamed from: d */
    public final mz5 f22188d;

    /* JADX INFO: renamed from: e */
    public final boolean f22189e;

    /* JADX INFO: renamed from: f */
    public final Long f22190f;

    /* JADX INFO: renamed from: g */
    public final String f22191g;

    public jd6(Context context, mz5 mz5Var, Long l) {
        this.f22189e = true;
        y42.m12854a0(context);
        Context applicationContext = context.getApplicationContext();
        y42.m12854a0(applicationContext);
        this.f22185a = applicationContext;
        this.f22190f = l;
        if (mz5Var != null) {
            this.f22188d = mz5Var;
            this.f22189e = mz5Var.f25349f;
            this.f22187c = mz5Var.f25348e;
            this.f22191g = mz5Var.f25351h;
            Bundle bundle = mz5Var.f25350g;
            if (bundle != null) {
                this.f22186b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
