package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eg3 {

    /* JADX INFO: renamed from: e */
    public static final HashMap f18072e = new HashMap();

    /* JADX INFO: renamed from: a */
    public boolean f18073a;

    /* JADX INFO: renamed from: b */
    public File f18074b;

    /* JADX INFO: renamed from: c */
    public Lock f18075c;

    /* JADX INFO: renamed from: d */
    public FileChannel f18076d;

    /* JADX INFO: renamed from: a */
    public final void m5123a(boolean z) {
        this.f18075c.lock();
        if (z) {
            File file = this.f18074b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f18076d = channel;
            } catch (IOException e) {
                this.f18076d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5124b() {
        try {
            FileChannel fileChannel = this.f18076d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f18075c.unlock();
    }
}
