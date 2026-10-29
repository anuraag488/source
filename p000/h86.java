package p000;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h86 {

    /* JADX INFO: renamed from: a */
    public final String f20434a;

    /* JADX INFO: renamed from: b */
    public final boolean f20435b;

    /* JADX INFO: renamed from: c */
    public boolean f20436c;

    /* JADX INFO: renamed from: d */
    public boolean f20437d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s86 f20438e;

    public h86(s86 s86Var, String str, boolean z) {
        this.f20438e = s86Var;
        y42.m12851X(str);
        this.f20434a = str;
        this.f20435b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6280a() {
        if (!this.f20436c) {
            this.f20436c = true;
            this.f20437d = this.f20438e.m10560y().getBoolean(this.f20434a, this.f20435b);
        }
        return this.f20437d;
    }

    /* JADX INFO: renamed from: b */
    public final void m6281b(boolean z) {
        SharedPreferences.Editor editorEdit = this.f20438e.m10560y().edit();
        editorEdit.putBoolean(this.f20434a, z);
        editorEdit.apply();
        this.f20437d = z;
    }
}
