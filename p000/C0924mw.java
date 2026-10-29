package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: mw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0924mw {

    /* JADX INFO: renamed from: a */
    public File f25248a;

    /* JADX INFO: renamed from: b */
    public List f25249b;

    /* JADX INFO: renamed from: c */
    public List f25250c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0924mw)) {
            return false;
        }
        C0924mw c0924mw = (C0924mw) obj;
        return this.f25248a.equals(c0924mw.f25248a) && this.f25249b.equals(c0924mw.f25249b) && this.f25250c.equals(c0924mw.f25250c);
    }

    public final int hashCode() {
        return this.f25250c.hashCode() + ((this.f25249b.hashCode() + (this.f25248a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BackupConfig(destinationDir=" + this.f25248a + ", backupFiles=" + this.f25249b + ", ignoredFiles=" + this.f25250c + ")";
    }
}
