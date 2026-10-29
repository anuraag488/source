package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x13 {

    /* JADX INFO: renamed from: a */
    public ArrayList f33913a;

    /* JADX INFO: renamed from: b */
    public CharSequence f33914b;

    /* JADX INFO: renamed from: c */
    public CharSequence f33915c;

    /* JADX INFO: renamed from: d */
    public PendingIntent f33916d;

    /* JADX INFO: renamed from: e */
    public byte f33917e;

    /* JADX INFO: renamed from: f */
    public boolean f33918f;

    /* JADX INFO: renamed from: g */
    public nh3 f33919g;

    /* JADX INFO: renamed from: h */
    public boolean f33920h;

    /* JADX INFO: renamed from: i */
    public Bundle f33921i;

    /* JADX INFO: renamed from: j */
    public String f33922j;

    /* JADX INFO: renamed from: k */
    public boolean f33923k;

    /* JADX INFO: renamed from: l */
    public ArrayList f33924l;

    /* JADX INFO: renamed from: a */
    public static CharSequence m12459a(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    /* JADX INFO: renamed from: b */
    public final void m12460b(nh3 nh3Var) {
        if (this.f33919g != nh3Var) {
            this.f33919g = nh3Var;
            if (((x13) nh3Var.f25810b) != this) {
                nh3Var.f25810b = this;
                m12460b(nh3Var);
            }
        }
    }
}
