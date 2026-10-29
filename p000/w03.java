package p000;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w03 extends zb2 {
    /* JADX INFO: renamed from: v */
    public static Long m12039v(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: b */
    public final void mo3775b(p83 p83Var, p83 p83Var2) throws IOException {
        try {
            Files.move(Paths.get(p83Var.f27432a.m10524o(), new String[0]), Paths.get(p83Var2.f27432a.m10524o(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            wb1.m12191j("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: q */
    public final xe1 mo3779q(p83 p83Var) throws EOFException {
        p83 p83VarM4823d;
        Path path = Paths.get(p83Var.f27432a.m10524o(), new String[0]);
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = p83.f27431b;
                String string = symbolicLink.toString();
                s50 s50Var = AbstractC0593e.f17543a;
                w30 w30Var = new w30();
                w30Var.m12058S(string);
                p83VarM4823d = AbstractC0593e.m4823d(w30Var, false);
            } else {
                p83VarM4823d = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM12039v = fileTimeCreationTime != null ? m12039v(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM12039v2 = fileTimeLastModifiedTime != null ? m12039v(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new xe1(zIsRegularFile, zIsDirectory, p83VarM4823d, lValueOf, lM12039v, lM12039v2, fileTimeLastAccessTime != null ? m12039v(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // p000.zb2
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
