package p000;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dn1 {

    /* JADX INFO: renamed from: a */
    public final int f17206a;

    /* JADX INFO: renamed from: b */
    public final int f17207b;

    /* JADX INFO: renamed from: c */
    public final Notification f17208c;

    public dn1(int i, Notification notification, int i2) {
        this.f17206a = i;
        this.f17208c = notification;
        this.f17207b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dn1.class != obj.getClass()) {
            return false;
        }
        dn1 dn1Var = (dn1) obj;
        if (this.f17206a == dn1Var.f17206a && this.f17207b == dn1Var.f17207b) {
            return this.f17208c.equals(dn1Var.f17208c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17208c.hashCode() + (((this.f17206a * 31) + this.f17207b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f17206a + ", mForegroundServiceType=" + this.f17207b + ", mNotification=" + this.f17208c + '}';
    }
}
