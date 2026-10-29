package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aw3 {

    /* JADX INFO: renamed from: a */
    public ArrayList f14916a;

    /* JADX INFO: renamed from: b */
    public ArrayList f14917b;

    /* JADX INFO: renamed from: c */
    public wv3 f14918c;

    /* JADX INFO: renamed from: d */
    public ArrayList f14919d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aw3.class != obj.getClass()) {
            return false;
        }
        aw3 aw3Var = (aw3) obj;
        return this.f14916a.equals(aw3Var.f14916a) && this.f14917b.equals(aw3Var.f14917b) && z62.m13387o(this.f14918c, aw3Var.f14918c) && this.f14919d.equals(aw3Var.f14919d);
    }

    public final int hashCode() {
        return (this.f14919d.hashCode() * 31) + (this.f14918c.hashCode() * 31) + (this.f14917b.hashCode() * 31) + (this.f14916a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.f14916a + ", overlayScenes=" + this.f14917b + ", currentScene=" + this.f14918c + ", previousScenes=" + this.f14919d + ")";
    }
}
