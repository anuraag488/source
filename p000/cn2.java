package p000;

import android.os.WorkSource;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cn2 {

    /* JADX INFO: renamed from: a */
    public int f16142a;

    /* JADX INFO: renamed from: b */
    public long f16143b;

    /* JADX INFO: renamed from: c */
    public long f16144c;

    /* JADX INFO: renamed from: d */
    public long f16145d;

    /* JADX INFO: renamed from: e */
    public long f16146e;

    /* JADX INFO: renamed from: f */
    public int f16147f;

    /* JADX INFO: renamed from: g */
    public float f16148g;

    /* JADX INFO: renamed from: h */
    public boolean f16149h;

    /* JADX INFO: renamed from: i */
    public long f16150i;

    /* JADX INFO: renamed from: j */
    public int f16151j;

    /* JADX INFO: renamed from: k */
    public int f16152k;

    /* JADX INFO: renamed from: l */
    public boolean f16153l;

    /* JADX INFO: renamed from: m */
    public WorkSource f16154m;

    /* JADX INFO: renamed from: n */
    public d16 f16155n;

    /* JADX INFO: renamed from: a */
    public final void m4051a(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        y42.m12848U("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z);
        this.f16150i = j;
    }
}
