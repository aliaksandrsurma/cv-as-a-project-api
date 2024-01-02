-- Inserting data into the projects table
INSERT INTO projects (
    title,
    description,
    role,
    image_url,
    start_date,
    end_date
) VALUES (
    'Adidas Payment Services',
    'Built/design an internal product in Adidas echosystem - Payment Service Suite.',
    'IT Payments Architect',
    '/images/projects/adidas.png',
    '2018-05-01',
    '2023-12-25'
);

-- Inserting data into the achievements_or_deliverables table (assuming this table exists and relates to projects)
INSERT INTO achievements_or_deliverables (project_id, achievement)
VALUES
    ((SELECT id FROM projects WHERE title = 'Adidas Payment Services'), 'TBD more details'),
    ((SELECT id FROM projects WHERE title = 'Adidas Payment Services'), 'TBD more details'),
    ((SELECT id FROM projects WHERE title = 'Adidas Payment Services'), 'TBD more details');

-- Inserting data into the artifact_examples table (assuming this table exists and relates to projects)
INSERT INTO artifact_examples (project_id, name, sample_screenshot, description)
VALUES
    ((SELECT id FROM projects WHERE title = 'Adidas Payment Services'), 'Project 1', '/images/projects/project1.png', 'This is the description of Project 1'),
    ((SELECT id FROM projects WHERE title = 'Adidas Payment Services'), 'Project 2', '/images/projects/project2.png', 'This is the description of Project 2'),
    ((SELECT id FROM projects WHERE title = 'Adidas Payment Services'), 'Project 3', '/images/projects/project3.png', 'This is the description of Project 3');

-- Inserting data into the technologies_or_tools table (assuming this table exists and relates to projects)
INSERT INTO technologies_or_tools (project_id, technology_or_tool)
VALUES
    ((SELECT id FROM projects WHERE title = 'Adidas Payment Services'), 'PlantUML'),
    ((SELECT id FROM projects WHERE title = 'Adidas Payment Services'), 'Gliffy');
