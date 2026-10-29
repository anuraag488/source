package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 extends kf1 {

    /* JADX INFO: renamed from: b */
    public boolean f23996b;

    /* JADX INFO: renamed from: c */
    public File[] f23997c;

    /* JADX INFO: renamed from: d */
    public int f23998d;

    /* JADX INFO: renamed from: e */
    public boolean f23999e;

    @Override // p000.pf1
    /* JADX INFO: renamed from: a */
    public final File mo7961a() {
        int i;
        boolean z = this.f23999e;
        File file = this.f27578a;
        if (!z && this.f23997c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f23997c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f23999e = true;
            }
        }
        File[] fileArr = this.f23997c;
        if (fileArr != null && (i = this.f23998d) < fileArr.length) {
            this.f23998d = i + 1;
            return fileArr[i];
        }
        if (this.f23996b) {
            return null;
        }
        this.f23996b = true;
        return file;
    }
}
