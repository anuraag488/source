package p000;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n86 {

    /* JADX INFO: renamed from: a */
    public final String f25539a;

    /* JADX INFO: renamed from: b */
    public final int f25540b;

    /* JADX INFO: renamed from: c */
    public boolean f25541c;

    /* JADX INFO: renamed from: d */
    public long f25542d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s86 f25543e;

    public n86(s86 s86Var, String str, long j) {
        Objects.requireNonNull(s86Var);
        this.f25543e = s86Var;
        y42.m12851X(str);
        this.f25539a = str;
        this.f25540b = (int) j;
    }

    /* JADX INFO: renamed from: a */
    public final long m8623a() {
        if (!this.f25541c) {
            this.f25541c = true;
            this.f25542d = this.f25543e.m10560y().getLong(this.f25539a, this.f25540b);
        }
        return this.f25542d;
    }

    /* JADX INFO: renamed from: b */
    public final void m8624b(long j) {
        SharedPreferences.Editor editorEdit = this.f25543e.m10560y().edit();
        editorEdit.putLong(this.f25539a, j);
        editorEdit.apply();
        this.f25542d = j;
    }
}
