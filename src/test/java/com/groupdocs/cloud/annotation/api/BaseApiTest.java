package com.groupdocs.cloud.annotation.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.aspose.storage.api.StorageApi;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.client.JSON;
import org.junit.After;
import org.junit.Before;

/**
 * API tests for AnnotationApi
 */
public class BaseApiTest {

    public final String FromUrlFolder = "tests\\from_url";
    public final String FromContentFolder = "tests\\from_content";

    protected AnnotationApi annotationApi;
    protected ImageInfoApi imageInfoApi;
    protected ImagePagesApi imagePagesApi;
    protected PdfFileApi pdfFileApi;
    private StorageApi storageApi;
    private static String resourcesPath = Paths.get("resources").toAbsolutePath().toString();

    public BaseApiTest() {
        super();

        Configuration configuration = new Configuration(Config.AppSID, Config.AppKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);

        annotationApi = new AnnotationApi(configuration);
        annotationApi.getApiClient().setConnectTimeout(300 * 1000);
        annotationApi.getApiClient().setReadTimeout(300 * 1000);

        imageInfoApi = new ImageInfoApi(configuration);
        imagePagesApi = new ImagePagesApi(configuration);
        pdfFileApi = new PdfFileApi(configuration);

        storageApi = new StorageApi(Config.ApiBaseUrl+ "/v1", Config.AppKey, Config.AppSID);
    }

    @Before
    public void setUp() {
        uploadTestData();
    }
    private void uploadTestData() {
        uploadFiles(resourcesPath);
    }

    public void uploadFiles(String path) {
        File directory = new File(path);

        File[] files = directory.listFiles();
        for (File file : files) {
            String relativePath = getRelativePath(file.getAbsolutePath(), resourcesPath);
            if (file.isFile()) {
                uploadFile(file, relativePath);
            } else if (file.isDirectory()) {
                uploadFiles(file.getAbsolutePath().toString());
            }
        }
    }

    private String getRelativePath(String absolutePath, String basePath) {
        Path absolute = Paths.get(absolutePath);
        Path base = Paths.get(basePath);
        Path relative = base.relativize(absolute);

        return relative.toString();
    }

    private void uploadFile(File file, String relativePath) {
        String filePath = relativePath.replace("\\", "/");
        storageApi.PutCreate(filePath, null, null, file);
    }
    @After
    public void cleanup() {
        removeTempFiles();
    }

    private void removeTempFiles() {
        deleteFolderFromStorage("cache");
        deleteFolderFromStorage("tests");
    }

    private void deleteFolderFromStorage(String folderName) {
        storageApi.DeleteFolder(folderName, null, true);
    }

    public File getTestFile(TestFile testFile) throws FileNotFoundException {
        Path filePath = Paths.get("resources", testFile.getFolder(), testFile.getFileName());
        File file = filePath.toFile();
        if (!file.exists())
            throw new FileNotFoundException(file.getAbsolutePath());

        return file;
    }

    public File toJsonFile(Object obj) throws IOException {
        JSON json = new JSON();
        String content = json.serialize(obj);

        File file = File.createTempFile("java", ".json");
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(content);
        fileWriter.close();

        return file;
    }
}