package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nf1 extends kf1 {

    /* JADX INFO: renamed from: b */
    public boolean f25743b;

    /* JADX INFO: renamed from: c */
    public File[] f25744c;

    /* JADX INFO: renamed from: d */
    public int f25745d;

    @Override // p000.pf1
    /* JADX INFO: renamed from: a */
    public final File mo7961a() {
        boolean z = this.f25743b;
        File file = this.f27578a;
        if (!z) {
            this.f25743b = true;
            return file;
        }
        File[] fileArrListFiles = this.f25744c;
        if (fileArrListFiles != null && this.f25745d >= fileArrListFiles.length) {
            return null;
        }
        if (fileArrListFiles == null) {
            fileArrListFiles = file.listFiles();
            this.f25744c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        int i = this.f25745d;
        this.f25745d = i + 1;
        return fileArrListFiles[i];
    }
}
